/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author wedun
 */
public class Lab5 {
    public static ArrayList <Dwelling> housing = new ArrayList<Dwelling>();
    public static void setHousing(Dwelling place){
        housing.add(place);
    }
    public static Dwelling getHousing(int index){
        return housing.get(index);
    }
    public static int getHousingSize(){
        return housing.size();
    }
    public static void readFile(String filename){
        try{
            int i = 0;
            Scanner scnr = new Scanner(new File(filename));
            while(scnr.hasNext()){
                House home = new House(); 
                Apartment home1 = new Apartment();
            if(scnr.nextLine().trim().equals("H")){
                    home.setStreetAddress(scnr.nextLine().trim());
                    home.setCity(scnr.nextLine().trim());
                    home.setState(scnr.nextLine().trim());
                    home.setZip(scnr.nextLine().trim());
                    home.setBedrooms(Integer.parseInt(scnr.nextLine().trim()));
                    home.setBathrooms(Double.parseDouble(scnr.nextLine().trim()));
                    home.setAcreage(Double.parseDouble(scnr.nextLine().trim()));
                    home.setGarageSize(Integer.parseInt(scnr.nextLine().trim()));
                    housing.add(home);
                }
            else{
                    home1.setStreetAddress(scnr.nextLine().trim());
                    home1.setCity(scnr.nextLine().trim());
                    home1.setState(scnr.nextLine().trim());
                    home1.setZip(scnr.nextLine().trim());
                    home1.setBedrooms(Integer.parseInt(scnr.nextLine().trim()));
                    home1.setBathrooms(Double.parseDouble(scnr.nextLine().trim()));
                    home1.setApptNum(scnr.nextLine().trim());
                    home1.setLaundry(Boolean.parseBoolean(scnr.nextLine().trim()));
                    housing.add(home1);
            }
            }
            }
        catch(java.io.FileNotFoundException ex){
            System.err.println("File not found");
            System.exit(-1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //readFile("dwelling.txt");
        readFile(args[0]);
String output = "";
for(int i = 0; i<housing.size(); i++){
    String out1 = housing.get(i).toString();
    output += out1+ "\n";       
}
JOptionPane.showMessageDialog(null, output);
        // TODO code application logic here
    }
    
}
