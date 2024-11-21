package collection;

import java.util.*; 

//Write a program to convert an ArrayList to LinkedList 
public class ConvertALtoLL {


    public static <T> List<T> convertALtoLL(List<T> arrayList) 
    { 
  
        List<T> linkedList = new LinkedList<>(); 
  
        for (T item : arrayList) { 
  
        	linkedList.add(item); 
        } 
  
        return linkedList; 
    } 
  
    public static void main(String args[]) 
    { 
        List<String> arrayList = Arrays.asList("Java", "SQL", "Python", "Angular", "C++"); 
                                    
        System.out.println("Given ArrayList: " + arrayList); 
  
        List<String> linkedList = convertALtoLL(arrayList); 
            
  
        System.out.println("Returned LinkedList: " + linkedList); 
    } 
}
