import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> properties = new HashMap();
        properties.put("login", "Angelina");
        properties.put("password", "angelinaInHollywood123");
        properties.put("title", "Salt");
        properties.put("url", "www.angelina.hollywood");
        properties.put("errorMessage", "file has not been founded");

        String[] sensualKeys = {"login", "password", "url"};

        Printer.printPropertiesAndHideSensitiveData(properties, sensualKeys);
    }
}
