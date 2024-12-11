package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Write a program to find String Start with letter A and find it's length and sort it by length of string

public class SortByStringLength {

	    public static void main(String[] args) {
	    	
	        ArrayList<String> listOfNames = new ArrayList<>(20);
	        listOfNames.add("Arati");
	        listOfNames.add("Shubhangi");
	        listOfNames.add("Akash");
	        listOfNames.add("Tanuja");
	        listOfNames.add("Pooja");
	        listOfNames.add("Megha");
	        listOfNames.add("Jaya");
	        listOfNames.add("Archana");
	        listOfNames.add("Komal");
	        listOfNames.add("Aakanksha");
	        listOfNames.add("Ashok");
	        listOfNames.add("Lata");
	        listOfNames.add("Meera");
	        listOfNames.add("Ashwini");
	        listOfNames.add("Pallavi");
	        listOfNames.add("Atul");
	        listOfNames.add("Akashganga");
	        listOfNames.add("Asha");
	        listOfNames.add("Radha");
	        listOfNames.add("Sachin");

	        Collections.sort(listOfNames, Comparator.comparingInt(String::length));
	        	
	        for(int i = 0; i < listOfNames.size(); i++) {
	        	
	            if(listOfNames.get(i).startsWith("A")) {
	            	
	                System.out.println(listOfNames.get(i) + " - " + listOfNames.get(i).length());
	            }
	        }
	        
	    }
	}


//output
//Atul - 4
//Asha - 4
//Arati - 5
//Akash - 5
//Ashok - 5
//Archana - 7
//Ashwini - 7
//Aakanksha - 9
//Akashganga - 10
