package collectionframework;

import java.util.Hashtable;

public class table {
	public static void main(String args[]) {
		Hashtable<Double,String> t1=new Hashtable<>();
		t1.put(90.87, "Alan");
		t1.put(88.94, "Ben");
		t1.put(78.15, "Kate");
		System.out.println("Adding elements:"+t1);
		
		t1.remove(90.87);//or t1.remove(90.87, "Alan"); can also used
		System.out.println("Removing element:"+t1);
		
		System.out.println("Retrieving element:"+t1.get(78.15));
		
		System.out.println("Key values:"+t1.keySet());
		
		System.out.println("Elements:"+t1.values());
	}
}
