/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author wedun
 */
public class Dwelling {
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private int bedrooms;
    private double bathrooms;
    
    public Dwelling(){
        streetAddress = null;
        city = null;
        state = null;
        zip = null;
        bedrooms = 0;
        bathrooms = 0.0;
    }
    /**
     * @return the streetAddres
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * @param streetAddres the streetAddres to set
     */
    public void setStreetAddress(String streetAddres) {
        this.streetAddress = streetAddres;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @return the bedrooms
     */
    public int getBedrooms() {
        return bedrooms;
    }

    /**
     * @param bedrooms the bedrooms to set
     */
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    /**
     * @return the bathrooms
     */
    public double getBathrooms() {
        return bathrooms;
    }

    /**
     * @param bathrooms the bathrooms to set
     */
    public void setBathrooms(double bathrooms) {
        this.bathrooms = bathrooms;
    }
    public String toString(){
        return streetAddress+"|"+city+"|"+state+"|"+zip+"|"+bedrooms+"|"+bathrooms;
    }
}
