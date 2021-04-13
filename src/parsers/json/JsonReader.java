package parsers.json;

import parsers.data.Client;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonReader {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader("D:/stormnet-tasks/clientsForJSON.json");
        JSONTokener tokener = new JSONTokener(reader);

        JSONObject clientObject = (JSONObject) tokener.nextValue();
        String language = clientObject.getString("language");
        String profession = clientObject.getString("profession");
        String firstName = clientObject.getString("first-name");
        String lastName = clientObject.getString("last-name");
        Double percent = clientObject.getDouble("percent");
        Double cashBack = clientObject.getDouble("cash-back");
        Integer pinCode = clientObject.getInt("pin-code");

        Client client = new Client();
        client.setLanguage(language);
        client.setProfession(profession);
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setPercent(percent);
        client.setCashBack(cashBack);
        client.setPinCode(pinCode);

        System.out.println(client);
    }
}
