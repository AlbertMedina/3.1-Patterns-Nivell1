package level2.factory.countries.spain;

import level2.factory.interfaces.Address;

public class AddressSpain implements Address {

    @Override
    public String generateAddress(String street, int number, String city, String postcode) {
        return street + ", " + number + ", " + postcode + " " + city + ", Spain";
    }
}
