package level2.factory.countries.spain;

import level2.factory.interfaces.Address;
import level2.factory.interfaces.ContactFactory;
import level2.factory.interfaces.PhoneNumber;

public class ContactFactorySpain implements ContactFactory {

    @Override
    public PhoneNumber getPhoneNumber() {
        return new PhoneNumberSpain();
    }

    @Override
    public Address getAddress() {
        return new AddressSpain();
    }
}
