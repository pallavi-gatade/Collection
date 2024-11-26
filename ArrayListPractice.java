package collection;

import java.util.*;


public class ArrayListPractice {

	public static void main(String[] args) {
//	Write a Java program to create an array list, add some colors (strings) and print out the collection.

		ArrayList<String> colorsList = new ArrayList<>();
			colorsList.add("Black");
			colorsList.add("Red");
			colorsList.add("Orange");
			colorsList.add("Blue");
			colorsList.add("Green");
	        
	        System.out.println(" The Given List of Colours are : " + colorsList);
	        
//	  2.  Write a Java program to iterate through all elements in an array list.
	        
	        System.out.print("\n Iterate all the elements from the Given list : ");
	        
	        int size = colorsList.size();
	        
	        for(int i = 0 ; i < size ; i++) {
	        	
	        	 System.out.print (colorsList.get(i) + " ");
	        	 
	        	 if(i < size - 1)
	        		 System.out.print (",");
	        	 
	        }
	        
//	  3.  Write a Java program to insert an element into the array list at the first position.
	        
	        colorsList.add(0, "White");
	        System.out.println("\n\n Insert Element at First position : " + colorsList);
	        
//    4.  Write a Java program to retrieve an element (at a specified in dex) from a given array list.
	        
	        System.out.println("\n Please specify index number: ");
	        Scanner scanner = new Scanner(System.in);
	        int givenIndex = scanner.nextInt();
	       
	        if (givenIndex >= 0 && givenIndex < colorsList.size()) {
	        	
	            String element = colorsList.get(givenIndex);
	            System.out.println("\n Element at index " + givenIndex + " is " + element);
	            
	            
	        } else System.out.println("\n The Index number is Invalid ");
	        
//	   5.  Write a Java program to update an array element by the given element. 
	       
	        colorsList.remove(1);
	        System.out.println("\n One element Removed :" + colorsList);
	        
//	   6.  Write a Java program to update an array element by the given element.
	        
	        colorsList.set(1, "Grey");
	        System.out.println("\n one element updated :" + colorsList);
	        
	        
//	   7.  Write a Java program to search for an element in an array list.
	        
	        System.out.println("\n Provided List is: " + colorsList);
	        
	        
	        if (colorsList.contains("Orange"))
			{
				System.out.println(" Yes Given Element is found in the list ");
			}
			else
			{
				System.out.println("There is no such element");
			}
	        
//	   8. Write a Java program to sort a given array list.
	        
	        System.out.print("\n Before Sorting: " + colorsList);
	        Collections.sort(colorsList);
	        System.out.println("\n After Sorting: " + colorsList);
	        
//	   9. Write a Java program to copy one array list into another.
	        
	     List<String> newList = new ArrayList<>(colorsList);
	        
	        System.out.println(newList);
	        
//	   10. Write a Java program to shuffle elements in an array list.
	        
		      Collections.shuffle(colorsList);
		      System.out.println("Arraylist After shuffle " + colorsList);

//	   11. Write a Java program to reverse elements in an array list.
		      
		      Collections.reverse(colorsList);
		      System.out.println("Arraylist After shuffle " + colorsList);

//	   12. Write a Java program to extract a portion of an array list.
		      
		      List<String> subList = new ArrayList<>();

		        System.out.println("Sub List : " + colorsList.subList(2, 4));


//	   13. Write a Java program to compare two array lists.
	         
		        System.out.print("Comparing two list: ");
		        boolean equality = subList.equals(colorsList);
		        if(equality == true)
		        	System.out.println(" Both list are equals to eact other");
		        else
		        	System.out.println(" Both list are different to each other");
		       

//	   14. Write a Java program that swaps two elements in an array list.
	         
		        System.out.print("\n Before Swapping :"+ colorsList);
		        
		        Collections.swap(colorsList, 1, 3 );
		        System.out.println("\n After Swapping \n"+colorsList);

//	   15. Write a Java program to join two array lists.
		        
		        ArrayList<String> newlist = new ArrayList<>();
		        newlist.add("Maths");
		        newlist.add("Science");
		        newlist.add("English");
		        newlist.add("History");
		        newlist.add("Marathi");
				
		        colorsList.addAll(newlist);
		        
				System.out.println("\n Joined Two arraylist are : " + colorsList);
		        

//	    16. Write a Java program to clone an array list to another array list.
	         
				ArrayList clonedList = (ArrayList)colorsList.clone();
				
		        System.out.println("\n cloned list is : " + clonedList);

//	    17. Write a Java program to empty an array list.
	         
		        clonedList.clear();
		        System.out.println("\n empty an array list : " + clonedList);

//	    18. Write a Java program to test whether an array list is empty or not.
	         
		        if(!clonedList.isEmpty())
		        	System.out.println("\n Arrraylist is not empty");
		        else
		        	System.out.println("\n Arrraylist is empty");

//	    19. Write a Java program for trimming the capacity of an array list.
	         
		        System.out.println("\n Trimming : " + colorsList);
		        colorsList.trimToSize();
		        System.out.println("\n capacity of an array list :" + colorsList.size());
		        
//	    20. Write a Java program to increase an array list size.

		        newlist.ensureCapacity(newlist.size() * 2);
		        System.out.println("\n after increase an array list size" + newlist);

//	    21. Write a Java program to replace the second element of an ArrayList with the specified element.
	         
		        newlist.set(3, "Geography");
		        System.out.println("\n after replacing element in given index" + newlist);

//	    22. Write a Java program to print all the elements of an ArrayList using the elements' position.
	        
		        System.out.println("ArrayList elements with their index:");
		        for(int i=0;i < colorsList.size(); i++){
		            System.out.println(i + " "+ colorsList.get(i));
		        }
	}

}
