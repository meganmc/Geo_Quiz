package mcdonald;
/**
 *
 * @author meganmcdonald
 */

import java.io.Serializable;
import javax.servlet.http.HttpSession;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String email;
    private String userName;
    private String passWord;
    public User() {
        firstName = "";
        lastName = "";
        phoneNumber = "";
        address = "";
        city = "";
        state = "";
        zipCode = "";
        email = "";
        userName = "";
        passWord = "";
        
    }
    
    public User(String firstName, String lastName, String phoneNumber, String address, String city, String state, String zipCode, String email, String userName, String passWord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.email = email;
        this.userName = userName;
        this.passWord = passWord;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName(){
       return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress(){
        return address;
        
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity(){
        return city;
        
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState(){
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    
    public String getZipCode(){
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getPassWord(){
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
   
}
