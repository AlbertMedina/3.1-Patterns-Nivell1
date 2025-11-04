package level2;

import level2.service.ContactsRepository;
import level2.service.ContactsService;

public class Main {
    public static void main(String[] args) {

        ContactsRepository contactsRepository = new ContactsRepository();
        ContactsService contactsService = new ContactsService(contactsRepository);

        contactsService.addContact("Albert", "Spain", "Carrer de Girona", 100, "Barcelona", "08009", "612345789");
        contactsService.addContact("Marc", "Andorra", "Avinguda Meritxell", 50, "Andorra La Vella", "AD500", "698754321");
        contactsService.addContact("Albert", "Portugal", "Rua da Madeira", 200, "Oporto", "4000-069", "612345789");

        contactsService.showContacts();
    }
}
