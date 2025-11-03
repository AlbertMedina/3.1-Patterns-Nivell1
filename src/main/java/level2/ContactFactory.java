package level2;

public interface ContactFactory {

    String generatePhoneNumber(String number);

    String generateAddress(String street, int number, String city, String postcode);

}
