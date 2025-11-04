package level2.factory.countries.portugal;

import level2.factory.interfaces.Address;
import level2.factory.interfaces.ContactFactory;
import level2.factory.interfaces.PhoneNumber;

public class ContactFactoryPortugal implements ContactFactory {

    @Override
    public PhoneNumber getPhoneNumber() {
        return new PhoneNumberPortugal();
    }

    @Override
    public Address getAddress() {
        return new AddressPortugal();
    }
}
