package JavaTask7;

import java.util.ArrayList;
import java.util.Collections;

public class TreeMap {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Colleen");
		name.add("Jemimah");
		name.add("Daphny");
		
		ArrayList<String> id = new ArrayList<String>();
		
		id.add("123");
		id.add("456");
		id.add("789");
		System.out.println("Before sorting :" +name+id);
		Collections.sort(name);
		System.out.println("After sorting :" +name+id);

	}

}
