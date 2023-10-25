import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Printer {


    public static void printPropertiesAndHideSensitiveData(Map<String, String> properties, String[] sensitiveKeys) {
        List<String> sensitiveKeysAsList = Arrays.asList(sensitiveKeys);
        Stream<Map.Entry<String, String>> mapStream = properties.entrySet().stream();
        mapStream
                .forEach(e -> {
                    if (sensitiveKeysAsList.contains(e.getKey()))
                        System.out.println(e.getKey() + ": *****");
                    else
                        System.out.println(e.getKey() + " : " + e.getValue());
                });

    }
}
