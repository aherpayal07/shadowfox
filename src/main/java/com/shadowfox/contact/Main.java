package com.shadowfox.contact;

import com.shadowfox.contact.model.Contact;
import com.shadowfox.contact.service.ContactService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContactService contactService = new ContactService();

        while (true) {

            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    Contact contact = new Contact(name, phone, email);
                    contactService.addContact(contact);

                    break;

                case 2:

                    contactService.viewContacts();
                    break;

                case 3:

                    System.out.print("Enter Contact Number to Update: ");
                    int updateIndex = scanner.nextInt() - 1;
                    scanner.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter New Phone Number: ");
                    String newPhone = scanner.nextLine();

                    System.out.print("Enter New Email: ");
                    String newEmail = scanner.nextLine();

                    Contact updatedContact = new Contact(newName, newPhone, newEmail);
                    contactService.updateContact(updateIndex, updatedContact);

                    break;

                case 4:

                    System.out.print("Enter Contact Number to Delete: ");
                    int deleteIndex = scanner.nextInt() - 1;

                    contactService.deleteContact(deleteIndex);

                    break;

                case 5:

                    System.out.println("Thank you for using Contact Management System.");
                    scanner.close();
                    System.exit(0);

                    break;

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}