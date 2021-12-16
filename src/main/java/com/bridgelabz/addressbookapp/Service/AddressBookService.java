package com.bridgelabz.addressbookapp.Service;

import com.bridgelabz.addressbookapp.DTO.ContactDTO;
import com.bridgelabz.addressbookapp.model.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {
    @Override
    public List<Contact> getContact() {
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact(1,
                new ContactDTO("Naval", "Balingal", "Solaur", "Maha", "Solpaur", "413006", "8055055582")));
        return contactList;
    }

    @Override
    public Contact getContactById(int contactId) {
        Contact contact = new Contact(1,
                new ContactDTO("Praveen", "Konda", "Solpaur", "Maha", "Solpaur", "413006", "999999999"));
        return contact;
    }

    @Override
    public Contact createContact(ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        return contact;
    }

    @Override
    public Contact updateContact(int contactId, ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        return contact;
    }

    @Override
    public void deleteContact(int contactId) {

    }
}