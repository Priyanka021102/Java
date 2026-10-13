package collectionframework;

import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.HashMap;

public class map {
	public static void main(String args[]) {
		TreeMap<String,Integer> m1=new TreeMap<>();
		m1.put("Amy",100);
		m1.put("Lizzy",60);
		m1.put("Ben",35);
		System.out.println("Adding elements:"+m1);
				
		m1.remove("Amy");
		System.out.println("Removing element:"+m1);
		
		m1.remove("Lizzy", 60);
		System.out.println("Removing element:"+m1);
		
		LinkedHashMap<Double,Character> m2=new LinkedHashMap<>();
		m2.put(1.01, 'A');
		m2.put(2.02, 'B');
		m2.put(3.03, 'C');
		System.out.println("Adding elements:"+m2);
		
		System.out.println("Retriving element:"+m2.get(2.02));
	
		
		HashMap<Boolean,Character> m3=new HashMap<>();
		m3.put(true, 'A');
		m3.put(false, 'B');
		System.out.println("Adding elements:"+m3);
		
		System.out.println("Printing Key Values:"+m3.keySet());
		
		System.out.println("Printing Elements:"+m3.values());
		
		//
		HashMap<Double,Character> m21=new HashMap<>();
		m21.put(1.01, 'A');
		m21.put(2.02, 'B');
		m21.put(3.03, 'C');
		m21.put(4.04, 'D');
		m21.put(5.05, 'E');
		System.out.println("Adding elements:"+m21);
		
		m21.remove(2.02);
		System.out.println("Removing element:"+m21);
		
        System.out.println("Printing Key Values:"+m21.keySet());
		
		System.out.println("Printing Elements:"+m21.values());
	}

}
