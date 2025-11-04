package level2.factory.countries.portugal;

import level2.factory.interfaces.Address;

public class AddressPortugal implements Address {

    @Override
    public String generateAddress(String street, int number, String city, String postcode) {
        return street + " " + number + ", " + city + " (" + postcode + "), Portugal";
    }
}
