/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author wedun
 */
public class Lab3 {

    private static void importFile(String fileName) {
        int i = 0;
        String[] lines = new String[100];
        String[] validData = new String[100];
        
        try {
            Scanner insert = new Scanner(new File(fileName));
            while (insert.hasNext()) {
                lines = insert.nextLine().split(",");
                validData[i] = String.format("%-20s%-10s%10s%20s%30s%40s", lines[0].trim(),lines[1].trim(),lines[2].trim(),lines[3].trim(),lines[4].trim(),lines[5].trim());
                System.out.println(validData[i]);
                i++;
            }
        } catch (java.io.FileNotFoundException ex) {
            System.err.println("File not found");
            System.exit(-1);
        }
    }
    
    private static void validateFirstLastName(String fileName){
        //importFile("records.txt");
         int i = 0;
         int counter =0;
         int[] errorCounter = new int[100];
         String[] lines = new String[100];
        
        String[] FN = new String[100];
        String[] LN = new String[100];
        
        try {
            Scanner insert = new Scanner(new File(fileName));
            while (insert.hasNext()) {
                
                lines = insert.nextLine().split(",");
                
                FN[i] = String.format("%-20s", lines[0].trim());
                LN[i] = String.format("%-20s", lines[1].trim());
                
                if(FN[i].matches(".*\\d.*")){
                    System.out.println("Error caught with first name at index: "+i+": "+FN[i]);
                    //FN[i] = FN[i].replaceAll("\\d","");
                }
                 if(LN[i].matches(".*\\d.*")){
                     System.out.println("Error caught with last name at index: "+i+": "+LN[i]);
                    //LN[i] = LN[i].replaceAll("\\d",""); 
                }
                i++;
            }
          
        } catch (java.io.FileNotFoundException ex) {
            System.err.println("File not found");
            System.exit(-1);
        }
    }
    
    private static void validateGenderAge(String fileName){
        //importFile("records.txt");
         int i = 0;
         int counter =0;
         int[] errorCounter = new int[100];
         String[] lines = new String[100];
       
        String[] GD = new String[100];
        String[] AG = new String[100];
        
        try {
            Scanner insert = new Scanner(new File(fileName));
            while (insert.hasNext()) {
                
                lines = insert.nextLine().split(",");
                
                GD[i] = String.format("%-20s", lines[2].trim());
                AG[i] = String.format("%-20s", lines[3].trim());
                
                 String f = GD[i].toLowerCase().trim();
                 //if you use trim in the string.format it wont work with outspace
                 if (f.equals("female") == false & f.equals("male") == false){
                     System.out.println("Error caught at index: "+i+": "+GD[i]);
                 }
                 String filler0 = AG[i].trim();
                 if (filler0.length() == 0){
                    System.out.println("Empty space caught at index: "+i+": "+AG[i]);
                 }
                 else{
                     int filler1 = Integer.parseInt(AG[i].trim());
                     if(filler1 < 1){
                         System.out.println("Error found with age at index:"+i+": "+filler1);
                     }
                 }
                i++;
            }
          
        } catch (java.io.FileNotFoundException ex) {
            System.err.println("File not found");
            System.exit(-1);
        }
    }

    private static void validatePhoneNumberEmail(String fileName){
            //importFile("records.txt");
             int i = 0;
             int counter =0;
             int[] errorCounter = new int[100];
             String[] lines = new String[100];

            String[] PN = new String[100];
            String[] EA = new String[100];

            try {
                Scanner insert = new Scanner(new File(fileName));
                while (insert.hasNext()) {

                    lines = insert.nextLine().split(",");

                    PN[i] = String.format("%-20s", lines[4].trim());
                    EA[i] = String.format("%-20s", lines[5].trim());
                    
                    if(PN[i].length() == 0){
                        System.out.println("Error found with phone number at: "+i+": "+PN[i]);
                    }
                    if(Character.isDigit(EA[i].charAt(0)) == true){
                            System.out.println("Errpr found with email at: "+i+": "+EA[i]);
                    } 
                    String [] container = {"!","#","$","%","^","&","*","(",")"};
                    int numContainer = container.length;
                    
                    
                    /*String holder = PN[i];
                        if(Character.isDigit(holder.charAt(i))){
                            counter++;
                        }*/
                        
                    i++;
                }
                String [] container = {"!","#","$","%","^","&","*","(",")"};
                int numContainer = container.length;
                for(int q=0;q<numContainer;q++){
                    for(int p=0; p<EA.length;p++){
                        if(EA[p].contains(container[i]) == true){
                            System.out.println("Test");
                        }
                    }
                    
                }
                
            }
            catch (java.io.FileNotFoundException ex) {
                System.err.println("File not found");
                System.exit(-1);
            }
        }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //importFile("records.txt");
        validateFirstLastName("records.txt");
        validateGenderAge("records.txt");
        validatePhoneNumberEmail("records.txt");
        // TODO code application logic here
    }

}
