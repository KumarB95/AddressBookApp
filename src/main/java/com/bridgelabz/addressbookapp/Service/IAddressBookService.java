package com.bridgelabz.addressbookapp.Service;

import com.bridgelabz.addressbookapp.DTO.ContactDTO;
import com.bridgelabz.addressbookapp.model.Contact;

import java.util.List;

public interface IAddressBookService {
    List<Contact> getContact();

    Contact getContactById(int contactId);

    Contact createContact(ContactDTO contactDTO);

    Contact updateContact(int contactId, ContactDTO contactDTO);

    void deleteContact(int contactId);
}
