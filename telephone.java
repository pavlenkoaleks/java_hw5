import java.util.HashMap;
import java.util.Map;

public class telephone {
    Map<String, String> telephones = new HashMap<>();

    void addNote(String num, String name){
        telephones.put(num, name);
    }

    String findTelephone(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: telephones.entrySet()){
            String num = entry.getKey();
            String name = entry.getValue();
            if (name.equalsIgnoreCase(lastName)){
                stringBuilder.append(num);
                stringBuilder.append(": ");
                stringBuilder.append(name);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}