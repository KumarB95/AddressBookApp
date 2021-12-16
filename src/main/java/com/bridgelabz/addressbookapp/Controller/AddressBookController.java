package com.bridgelabz.addressbookapp.Controller;

import com.bridgelabz.addressbookapp.model.Contact;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
    @RequestMapping(value = {"", "/", "/get"})
    public String welcomeUser() {
        return "Welcome to address book home";
    }

    @GetMapping("/get/{id}")
    public String welcomeSpecificUser(@PathVariable String id) {
        return "Welcome, User " + id;
    }

    @PostMapping("/post")
    public String createContact(@RequestBody Contact contact) {
        return "Added " + contact.getName() + " to list";
    }

    @PutMapping("/update")
    public String updateContact(@RequestBody Contact contact) {
        return "Updated " + contact.getName() + " in list";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteContact(@PathVariable String id) {
        return "Deleted contact " + id;
    }
}
