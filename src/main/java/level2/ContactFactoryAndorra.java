package level2;

public class ContactFactoryAndorra implements ContactFactory {

    @Override
    public String generatePhoneNumber(String number) {
        return "";
    }

    @Override
    public String generateAddress(String street, int number, String city, String postcode) {
        return "";
    }
}
