package collection;

import java.util.*;

public class HashsetPractice {

	public static void main(String[] args) {

//		1. Write a Java program to append the specified element to the end of a hash set.
		 
		HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

//		2. Write a Java program to iterate through all elements in a hash list.
        
        for(int i : set)
        {
        	System.out.print(i + " ");
        }
        	

//		3. Write a Java program to get the number of elements in a hash set.
        
        System.out.println("\nNumber of elements in given set: " + set.size());
     
//		6. Write a Java program to clone a hash set to another hash set.
        
        HashSet<Integer> clonedSet = (HashSet<Integer>) set.clone();
        System.out.println("\nset after clone" + clonedSet);

//		4. Write a Java program to empty an hash set.
        
        clonedSet.clear();
        System.out.println("\n set after empty: " + clonedSet);

//		5. Write a Java program to test if a hash set is empty or not.
		 
        if (!set.isEmpty()) 
        	System.out.println("Set is Empty");
            
         else System.out.println("Set is Not Empty");


//		7. Write a Java program to convert a hash set to an array.
        
        Integer arr[] = new Integer[set.size()]; 
        
        System.out.print("convert a hash set to an array : ");
        int i=0; 
        
        // iterating over the hashset 
        for(Integer ele : set){ 
          arr[i++] = ele; 
        } 
  
        for (Integer n : arr) 
            System.out.print(n + " "); 
        

//		8. Write a Java program to convert a hash set to a tree set.
		 
        TreeSet<Integer> treeSet = new TreeSet<>(set);
        System.out.print("\nconvert a hash set to tree set : ");
        
        for (Integer element : treeSet) 
            System.out.print(element + " ");

//		9. Write a Java program to find numbers less than 7 in a tree set.
        
        TreeSet<Integer> newSet = new TreeSet<>();
        newSet.add(1);
        newSet.add(2);
        newSet.add(3);
        newSet.add(9);
        newSet.add(5);
        newSet.add(10);
        newSet.add(7);
        newSet.add(8);
        
        TreeSet<Integer> lessThan = new TreeSet<>(newSet.headSet(7));
        
        System.out.print("\nnumbers less than 7 in a tree set : ");
        for (Integer element : lessThan) {
            System.out.print(element + " ");
        }

//		10. Write a Java program to compare two hash set.
        
        boolean compare = set.equals(newSet);
        
        if(compare == true)
        	System.out.println("\ntwo HashSets are equal ");
        else
        	System.out.println("\ntwo HashSets are not equal ");

//		11. Write a Java program to compare two sets and retain elements that are the same.
		 
        Set<Integer> set1 = new HashSet<>();
        set1.add(20);
        set1.add(35);
        set1.add(10);
        set1.add(15);

        set.retainAll(set1);
        System.out.print("\nRetain elements are: "  + set);

//		12. Write a Java program to remove all elements from a hash set.
        
        set1.clear();
        System.out.print("\nremove all elements from a hash set : "  + set1);
        
	}

}
