package level2;

public class PortugalPhoneNumber implements PhoneNumber {
    
    @Override
    public String generatePhoneNumber(String number) {
        return "+351 " + number;
    }
}
