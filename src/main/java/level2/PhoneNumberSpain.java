package level2;

public class PhoneNumberSpain implements PhoneNumber {

    @Override
    public String generatePhoneNumber(String number) {
        return "+34 " + number;
    }
}
