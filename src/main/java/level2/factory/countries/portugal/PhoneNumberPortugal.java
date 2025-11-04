package level2.factory.countries.portugal;

import level2.factory.interfaces.PhoneNumber;

public class PhoneNumberPortugal implements PhoneNumber {

    @Override
    public String generatePhoneNumber(String number) {
        return "+351 " + number;
    }
}
