package level2;

public class SpainPhoneNumber implements PhoneNumber {

    @Override
    public String generatePhoneNumber(String number) {
        return "+34 " + number;
    }
}
