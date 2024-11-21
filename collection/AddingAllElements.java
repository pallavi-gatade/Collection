package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddingAllElements {

	public static void main(String[] args)
    {
        String[] str = { "Sachin", "Poonam", "Lata", "mahesh", "Radha" };

        List<String> al = new ArrayList<String>();

        Collections.addAll(al, str);

        System.out.println("Given String is :" + al);
    }
}
