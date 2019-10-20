/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;

/**
 *
 * @author wedun
 */
public class Apartment extends Dwelling {
    private String apptNum;
    private boolean laundry;
    
    public Apartment(){
        apptNum = null;
        laundry = false;
    }
    
    public String toString(){
        return super.toString()+getApptNum()+"|"+isLaundry();
    }

    /**
     * @return the apptNum
     */
    public String getApptNum() {
        return apptNum;
    }

    /**
     * @param apptNum the apptNum to set
     */
    public void setApptNum(String apptNum) {
        this.apptNum = apptNum;
    }

    /**
     * @return the laundry
     */
    public boolean isLaundry() {
        return laundry;
    }

    /**
     * @param laundry the laundry to set
     */
    public void setLaundry(boolean laundry) {
        this.laundry = laundry;
    }
}
