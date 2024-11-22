package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeFailFastIteratorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Map<String, String> map = new HashMap<String, String>(); //ConcurrentModificationException
		Map<String, String> map = new ConcurrentHashMap();  //fail-safe 
		
		map.put("Geeta", "12");
		map.put("Jaya", "62");
		map.put("Komal", "34");
		map.put("Pooja", "45");
		map.put("Isha", "27");
		
		Set<String> keySet = map.keySet(); 
		
		Iterator<String> iterator = keySet.iterator();
		
//		System.out.print ("Given Names are :" );
//		while(iterator.hasNext()) {
//			System.out.print ( iterator.next() + " ");
//		}
		System.out.print ("\nUpdated Names are :" );
		
		while(iterator.hasNext()) {
			
			map.put("Radha", "54");
			String mapList = iterator.next();
			
			System.out.println (mapList + " "+ map.get(mapList));
//			System.out.print ( iterator.next() );
		}
	}

}
