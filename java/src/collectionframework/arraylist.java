package collectionframework;

import java.util.ArrayList;

public class arraylist {
	public static void main(String args[]) {
	/*
	ArrayList<Character> d=new ArrayList<>();
	d.add('A');
	d.add('B');
	d.add('C');
	d.add('D');
	System.out.println(d);
	
	d.remove(2);
	System.out.println(d);
	
	System.out.println(d.get(2));
	
	for(Character x:d) {
		System.out.println(x);
	}
	*/
		ArrayList<String> s=new ArrayList<>();
		s.add("Apple");
		s.add("Ball");
		s.add("Cat");
		s.add("Dog");
		System.out.println(s);
		
		s.remove(2);
		System.out.println(s);
		
		System.out.println(s.get(0));
		
		for(String x:s) {
			System.out.println(x);
		}
	}
}
