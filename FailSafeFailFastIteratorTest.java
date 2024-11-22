package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailSafeFailFastIteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("Maths");
		list.add("English");
		list.add("Science");
		list.add("History");
		list.add("Hindi");
		
//		for(String i : list) {
//			
//			System.out.println("the given list is :");
//			list.add("IT");  //fail-fast
//		}
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println("The given Element is : " + iterator.next());
//			list.remove("History");
			iterator.remove(); //Fail-safe
		}
			
		
	}

}
