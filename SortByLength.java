package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByLength {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Sky");
		list.add("Art");
		list.add("Land");
		list.add("Sea");
		list.add("Air");
		list.add("Water");
		list.add("Road");
		list.add("Cloud");
		list.add("Atmosphere");
		list.add("Atom");
		list.add("Dam");
		list.add("Airline");
		list.add("Stapler ");
		list.add("Plants");
		list.add("Animals");
		list.add("Rain ");
		list.add("Winter");
		
		System.out.println("InputList :" + list);
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() > o2.length()) {
					return 1;
				} else {
					return o1.compareTo(o2);
				}
			}
		});
		

		System.out.println("SortedList :" + list);
		
		System.out.println("\nElements start with letter A :");
		
		  for(int i = 0; i < list.size(); i++) {
	        	
	            if(list.get(i).startsWith("A")) {
	            	
	                System.out.println(list.get(i) + " - " + list.get(i).length());
	            }
	        }
	
	}

}

//output
//	InputList :[Sky, Art, Land, Sea, Air, Water, Road, Cloud, Atmosphere, Atom, Dam, Airline, Stapler , Plants, Animals, Rain , Winter]
//	SortedList :[Air, Art, Dam, Sea, Sky, Atom, Land, Road, Cloud, Water, Airline, Animals, Atmosphere, Plants, Rain , Stapler , Winter]
//	
//	Elements start with letter A :
//	Air - 3
//	Art - 3
//	Atom - 4
//	Airline - 7
//	Animals - 7
//	Atmosphere - 10


