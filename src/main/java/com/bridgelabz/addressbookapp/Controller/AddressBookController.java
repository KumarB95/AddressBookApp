package com.bridgelabz.addressbookapp.Controller;

import com.bridgelabz.addressbookapp.DTO.ContactDTO;
import com.bridgelabz.addressbookapp.DTO.ResponseDTO;
import com.bridgelabz.addressbookapp.Service.IAddressBookService;
import com.bridgelabz.addressbookapp.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
    @Autowired
    private IAddressBookService addressbookservice;

    @RequestMapping(value = { "", "/", "/get" })
    public ResponseEntity<ResponseDTO> getContactData() {
        List<Contact> contactList = null;
        contactList=addressbookservice.getContact();
        ResponseDTO response = new ResponseDTO("Get call success", contactList);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }

    @GetMapping("/get/{contactId}")
    public ResponseEntity<ResponseDTO> getContactData(@PathVariable("contactId") int contactId) {
        Contact contact = addressbookservice.getContactById(contactId);
        ResponseDTO response = new ResponseDTO("Get call success for id", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addContactData(@RequestBody ContactDTO contactDTO) {
        Contact contact = addressbookservice.createContact(contactDTO);
        ResponseDTO response = new ResponseDTO("Created contact data for", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    @PutMapping("/update/{contactId}")
    public ResponseEntity<ResponseDTO> updateContactData(@PathVariable("contactId") int contactId,
                                                         @RequestBody ContactDTO contactDTO) {
        Contact contact = null;
        contact=addressbookservice.updateContact(contactId, contactDTO);
        ResponseDTO response = new ResponseDTO("Updated contact data for", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

}
