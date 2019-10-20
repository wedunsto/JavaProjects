/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsmodel;

/**
 *
 * @author wedun
 */
public class Client {    
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String phone;
    private String email;

    /**
     */
    public Client(){
        firstName = "";
        lastName = "";
        gender = "";
        age = 0;
        phone = "";
        email = "";
    }
    
       public Client(String fn, String ln, String gndr, int age, String phone, String email){
        firstName = fn;
        lastName = ln;
        gender = gndr;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.gender = Gender;
    }

    /**
     * @return the Age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
        this.age = Age;
    }

    /**
     * @return the Phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param Phone the Phone to set
     */
    public void setPhone(String Phone) {
        this.phone = Phone;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.email = Email;
    }
    @Override
    public String toString(){
        return firstName+","+lastName+","+gender+","+age+","+phone+","+email+"\n"; 
        //return String.format("%-20s%-19s%-18s%-17s%-16s%-15s", firstName, lastName, Gender,Age,Phone,Email);
    }
    
}
