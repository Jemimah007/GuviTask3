package JavaTask7;

import java.util.ArrayList;

public class RemoveElements {

	public static void main(String[] args) {
			ArrayList<String> str = new ArrayList<String>();
			
			str.add("Hello");
			str.add("Java");
			str.add("Selenium");
			
			System.out.println("Before Clearing :"+str);
			
			str.clear();
			
			System.out.println("After Clearing :"+str);
			

	}

}

