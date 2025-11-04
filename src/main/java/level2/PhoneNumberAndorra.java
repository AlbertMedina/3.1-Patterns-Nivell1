package level2;

public class PhoneNumberAndorra implements PhoneNumber {

    @Override
    public String generatePhoneNumber(String number) {
        return "+376 " + number;
    }
}
