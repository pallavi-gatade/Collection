package collection;

import java.util.*;

public class OccuranceOfWordUsingHashmap {

	public static void main(String[] args)
    {
 
        String str = "Java Programing In Java Development Tools";

        Map<String, Integer> hashMap = new HashMap<>();
 
        String[] words = str.split(" ");
 
        for (String word : words) {
 
            Integer index = hashMap.get(word);
 
            if (index == null)
            	
                hashMap.put(word, 1);
 
            else {
            	
                hashMap.put(word, index + 1);
            }
        }
        System.out.println(hashMap);
    }
}
