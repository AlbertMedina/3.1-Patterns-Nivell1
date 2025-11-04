package level2.factory.countries.andorra;

import level2.factory.interfaces.PhoneNumber;

public class PhoneNumberAndorra implements PhoneNumber {

    @Override
    public String generatePhoneNumber(String number) {
        return "+376 " + number;
    }
}
