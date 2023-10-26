import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProvider {

    public static Map<String, String> provideProperties() {
        Map<String, String> properties = new HashMap();
        properties.put("login", "Angelina");
        properties.put("password", "angelinaInHollywood123");
        properties.put("title", "Salt");
        properties.put("url", "www.angelina.hollywood");
        properties.put("errorMessage", "file has not been founded");
        return properties;
    }
    public static List<String> provideSensitiveKeys() {
        return List.of("login", "password", "url");
    }
}