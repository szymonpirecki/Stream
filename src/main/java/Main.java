import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> properties = DataProvider.provideProperties();
        List<String> sensualKeys = DataProvider.provideSensitiveKeys();

        Printer.printPropertiesAndHideSensitiveData(properties, sensualKeys);
    }
}