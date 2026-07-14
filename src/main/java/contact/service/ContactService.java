package com.shadowfox.contact.service;

import com.shadowfox.contact.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

    private List<Contact> contacts = new ArrayList<>();

    // Add Contact
    public void addContact(Contact contact) {

        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }

    // View Contacts
    public void viewContacts() {

        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }

        for (int i = 0; i < contacts.size(); i++) {

            System.out.println("Contact No: " + (i + 1));
            System.out.println(contacts.get(i));
            System.out.println("---------------------------");
        }
    }

    // Update Contact
    public void updateContact(int index, Contact updatedContact) {

        if (index >= 0 && index < contacts.size()) {

            contacts.set(index, updatedContact);
            System.out.println("Contact updated successfully!");

        } else {

            System.out.println("Invalid contact number.");
        }
    }

    // Delete Contact
    public void deleteContact(int index) {

        if (index >= 0 && index < contacts.size()) {

            contacts.remove(index);
            System.out.println("Contact deleted successfully!");

        } else {

            System.out.println("Invalid contact number.");
        }
    }
}