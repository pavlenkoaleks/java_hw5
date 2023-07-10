import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;
  

public class task2 {
    
    public static void main(String[] args) {
        String s = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, " +
        "Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова "+ 
        "Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, "+ 
        "Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. ";
        s = s.replace(".", "");
        s = s.replace("\n", " ");
        s = s.replace("  ", " ");
        s = s.replace(",", "");
        String[] words = s.split(" ");
       List<String> wordswithoutLN = new ArrayList() ;
        for(int i=0;  i<words.length;i=i+2)
        {wordswithoutLN.add(words[i]);
        }
        
        System.out.println(wordswithoutLN);
        Map<String,Integer> map = new TreeMap<>();
        for (String word: wordswithoutLN){
            if (map.containsKey(word)==false){
                map.put(word, 1);
            }
            else{map.put(word, map.get(word)+1);
             }   
                

        }
        System.out.println(map);
         
        map = map.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (oldValue, newValue) -> oldValue,
                                        LinkedHashMap::new
                    ));
 
        System.out.println("Сортировка: " + map);
        
 
 }


 


 
}