package collection;

import java.util.*; 

public class RemoveSpecElement {

    public static void main(String[] args)
    {
 
        List<Integer> al = new ArrayList<>();
 
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
        al.add(30);
 
        System.out.println("Given List : " + al);
 
        al.remove(1);
        al.remove(1);
        
        System.out.println("Upadted List : " + al);
    }
}
