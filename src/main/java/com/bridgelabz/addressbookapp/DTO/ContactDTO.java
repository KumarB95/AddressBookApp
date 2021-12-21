package com.bridgelabz.addressbookapp.DTO;

import lombok.Data;
import lombok.NonNull;

public @Data
class ContactDTO {

    public String firstName;
    public String lastName;
    public String address;
    public String state;
    public String city;
    public String zip;
    public String phone;
    public int contactId;

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }
    public ContactDTO(String firstName, String lastName, String address, String state, String city, String zip,
                      String phone) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.phone = phone;
    }

}