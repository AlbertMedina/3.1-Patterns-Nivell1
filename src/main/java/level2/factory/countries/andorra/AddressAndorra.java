package level2.factory.countries.andorra;

import level2.factory.interfaces.Address;

public class AddressAndorra implements Address {

    @Override
    public String generateAddress(String street, int number, String city, String postcode) {
        return number + " " + street + ", " + postcode + " " + city + ", Andorra";
    }
}
