package level2.factory.countries.spain;

import level2.factory.interfaces.PhoneNumber;

public class PhoneNumberSpain implements PhoneNumber {

    @Override
    public String generatePhoneNumber(String number) {
        return "+34 " + number;
    }
}
