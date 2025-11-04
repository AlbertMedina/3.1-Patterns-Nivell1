package level2.service;

import level2.factory.countries.andorra.ContactFactoryAndorra;
import level2.factory.interfaces.ContactFactory;
import level2.factory.countries.portugal.ContactFactoryPortugal;
import level2.factory.countries.spain.ContactFactorySpain;

public class ContactsService {

    private final ContactsRepository contactsRepository;

    public ContactsService(ContactsRepository contactsRepository) {
        this.contactsRepository = contactsRepository;
    }

    public void addContact(String name, String country, String street, int number, String city, String postcode, String phoneNumber) {
        try {
            ContactFactory contactFactory = switch (country.trim().toLowerCase()) {
                case "spain" -> new ContactFactorySpain();
                case "andorra" -> new ContactFactoryAndorra();
                case "portugal" -> new ContactFactoryPortugal();
                default -> throw new IllegalArgumentException("Invalid country");
            };
            String formattedAddress = contactFactory.getAddress().generateAddress(street, number, city, postcode);
            String formattedPhoneNumber = contactFactory.getPhoneNumber().generatePhoneNumber(phoneNumber);
            Contact contact = new Contact(name, formattedAddress, formattedPhoneNumber);
            contactsRepository.addContact(contact);
        } catch (Exception e) {
            System.out.println("Error adding contact: " + e.getMessage());
        }
    }

    public void showContacts() {
        System.out.println("CONTACTS");
        System.out.println("--------------------------------------");
        System.out.println(contactsRepository.getContactsList());
    }
}
