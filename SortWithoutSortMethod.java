package collection;

import java.util.*;


public class SortWithoutSortMethod {

	public static void main(String[] args) {
		
//        int[] a = {2,5,1,56,45, 16, 34, 8, 25};
		
		List<Integer> list = new ArrayList<>();
       
        list.add(9);
        list.add(2);
        list.add(7);
        list.add(6);
        list.add(4);
        list.add(1);
        
        System.out.print ("Input Array List is: " + list);
        
        System.out.print ("\nSorted Array List is: ");
        for(int i = 0; i < list.size(); i++){
        	
            for(int j = i + 1; j < list.size(); j++){
            	
                if(list.get(i) > list.get(j)){
                	
	                int temp = list.get(i);
	                list.set(i, list.get(j));
	                list.set(j, temp);
	                
//	                list.get(i) =  list.get(j);
//	                list.get(j) = temp;
                }
            }
        } 
       for (int i = 0; i < list.size(); i++) 
           {     
              System.out.print(list.get(i));  
              
              if(i < list.size() - 1) 
              {     
                 System.out.print(", ");  
              }
           }
       
       }
	
}
