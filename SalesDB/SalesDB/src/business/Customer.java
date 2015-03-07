/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author TechWiz
 */
public class Customer 
{
    private long customerId, areaCode, salesPersonId, phoneNumber;
    private String name, address, city, state, zipCode, comments;
    private double creditLimit;
    
    public Customer()
    {
        this.customerId = 0;
        this.areaCode = 0;
        this.phoneNumber =0;
        this.salesPersonId =0;
        this.creditLimit =0;
        this.address = "";
        this.comments = "";
        this.name = "";
        this.state = "";
        this.city = "";
        this.zipCode = "";
        
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(long areaCode) {
        this.areaCode = areaCode;
    }

    public long getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(long salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
    
    @Override
    public String toString()
    {
        return this.name + " (" + this.customerId + ")";
    }
   
    
}
