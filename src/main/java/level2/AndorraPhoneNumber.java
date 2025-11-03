package level2;

public class AndorraPhoneNumber implements PhoneNumber {

    @Override
    public String generatePhoneNumber(String number) {
        return "+376 " + number;
    }
}
