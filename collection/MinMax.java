package collection;

import java.util.*; 

public class MinMax {

	public static void main(String[] args) 
    { 
        
        List<Integer> list = new ArrayList<>(); 
  
        list.add(3); 
        list.add(5); 
        list.add(18); 
        list.add(4); 
        list.add(6); 
  
        int minimum = Collections.min(list); 
  
        int maximum = Collections.max(list); 
  
       
            System.out.println("Min value  : " + minimum); 
                              
            System.out.println("Max value  : "  + maximum); 
                             
        
    }
}
