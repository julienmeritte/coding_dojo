import java.util.LinkedHashMap;
import java.util.Map;

public class FooBarQix {

    public String compute(String valeur) {
        Map<Integer, String> map = new LinkedHashMap<>();
        StringBuilder builder = new StringBuilder();
        String valeurExacte;

        map.put(3, "Foo");
        map.put(5, "Bar");
        map.put(7, "Qix");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (Integer.parseInt(valeur) % entry.getKey() == 0) {
                builder.append(entry.getValue());
            }
        }

        for (int i = 0; i < valeur.length(); i++) {
            valeurExacte = map.get(valeur.charAt(i) - '0');
            if (valeurExacte != null) {
                builder.append(valeurExacte);
            }
        }

        return builder.toString();
    }
}
