/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsmodel;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wedun
 */
public class ContactList {
    private String listName;
    private ArrayList<Client> contacts;
    
    public ContactList(){
        listName = " ";
        contacts = new ArrayList<Client>();
    }
    /**
     * @return the listName
     */
    public String getListName() {
        return listName;
    }
    /**
     * @param listName the listName to set
     */
    public void setListName(String listName) {
        this.listName = listName;
    }
    public Client getContact(int index){
        if(index < 0 | index >= contacts.size()){
            return null;
        }
         return contacts.get(index);
    }
    public int size(){
        return contacts.size();
    }
    public void deleteContact(int index){
        contacts.remove(index);
    }
    public void addContact(Client client){
        contacts.add(client);
    }
    public void loadContacts(String filename){
     
        //String[] line = new String[100];
        try{
        Scanner scnr = new Scanner(new File(filename));
        listName = scnr.nextLine();
        while(scnr.hasNext()){
            String [] line = scnr.nextLine().split(",");
            Client people = new Client();
            people.setFirstName(line[0].trim());
            people.setLastName(line[1].trim());
            people.setGender(line[2].trim());
            people.setAge(Integer.parseInt(line[3].trim()));
            people.setPhone(line[4].trim());
            people.setEmail(line[5].trim()); 
            contacts.add(people);
            
        }
           
        }
        catch(java.io.FileNotFoundException ex){
            System.err.println("File not found.");
            System.exit(-1);
        }
    }
    public void saveContacts(String filename){
        try{
            PrintWriter write = new PrintWriter(new File(filename));
            write.println(toString());
            write.close();
        }
        catch(java.io.FileNotFoundException ex){
            System.err.println("File not found");
            System.exit(-1);
        }
    }
    public String toString(){
        String sOut = listName;
        for(int i=0; i<contacts.size(); i++){
            sOut += contacts.get(i).toString();
        }
        return sOut;
    }
}
