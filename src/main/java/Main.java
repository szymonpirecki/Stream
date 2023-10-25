import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Mając dowolną mapę, np:
        Map<String, String> properties = new HashMap();
        properties.put("login", "Angelina");
        properties.put("password", "angelinaInHollywood123");
        properties.put("title", "Salt");
        properties.put("url", "www.angelina.hollywood");
        properties.put("errorMessage", "file has not been founded");


//wypisz na konsoli wartości properties, ale jeśli propertes jest sensitive to zamiast wartości wypisz ******
        String[] sensualKeys = {"login", "password", "url"};

        Printer.printPropertiesAndHideSensitiveData(properties, sensualKeys);
    }
}
