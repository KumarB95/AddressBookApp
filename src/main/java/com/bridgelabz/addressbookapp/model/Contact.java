package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.DTO.ContactDTO;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addressbook")
public class Contact {
    @Id
    @Column(name="contactId")
    private int contactId;
    @Column(name="firstName")
    public String firstName;
    @Column(name="lastName")
    public String lastName;
    @Column(name="address")
    public String address;
    @Column(name="state")
    public String state;
    @Column(name="city")
    public String city;
    @Column(name="zip")
    public String zip;
    @Column(name="phone")
    public String phone;

    public Contact(int contactId,String firstName,String lastName,String address,String state,String city,String zip,String phone) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.phone = phone;
    }

    public Contact(int contactId, ContactDTO contactDTO) {

    }
    public Contact() {

    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
