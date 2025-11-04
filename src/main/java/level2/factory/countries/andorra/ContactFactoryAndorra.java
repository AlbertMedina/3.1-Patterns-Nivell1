package level2.factory.countries.andorra;

import level2.factory.interfaces.Address;
import level2.factory.interfaces.ContactFactory;
import level2.factory.interfaces.PhoneNumber;

public class ContactFactoryAndorra implements ContactFactory {

    @Override
    public PhoneNumber getPhoneNumber() {
        return new PhoneNumberAndorra();
    }

    @Override
    public Address getAddress() {
        return new AddressAndorra();
    }
}
