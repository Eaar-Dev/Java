package listas.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(100, "Hola");
        map.put(101, "Equis");
        map.put(102, "De");
        map.put(103, "qpdinwd");

        for (Map.Entry elem : map.entrySet()) {
            System.out.println(elem.getKey() + " " + elem.getValue());
        }
    }

}
