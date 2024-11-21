package collection;

import java.util.*; 

public class CompareTwoArrayList {

	public static void main(String[] args)
    {
 
        ArrayList<String> list1
            = new ArrayList<String>();
        ArrayList<String> list2
            = new ArrayList<String>();
 
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
 
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
 
        System.out.println(" List 1 = " + list1);
        System.out.println(" List 2 = " + list2);
 
        if (list1.equals(list2) == true) {
            System.out.println("Both List are equal");
        }
        else
        {
            System.out.println("Both List are not equal");
        }
 
        System.out.println(" insert one item in List 1");
        
        list1.add("5");
 
        System.out.println("list 1 = " + list1);
        System.out.println("list 2 = " + list2);
 
        if (list1.equals(list2) == true) {
            System.out.println("Given List are equal");
        }
        else {
            System.out.println("Give List are not equal");
        }
    }
}
