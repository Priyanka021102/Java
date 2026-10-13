package collectionframework;

import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.HashSet;

public class set {
	public static void main(String args[]) {
		TreeSet<Integer>s1=new TreeSet<>(); //alphabetical or ascending order
		s1.add(1);
		s1.add(3);
		s1.add(2);
		System.out.println("Adding elements:"+s1); 
		
		/*
		s1.remove(1);
		System.out.println("Removing an element:"+s1); //operation can be done in other sets(Linked hash set and Hash set)
		
		for(int x:s1) { 
			System.out.println("Iteration:"+x);//operation can be done in other sets(Linked hash set and Hash set)
		}
		
		LinkedHashSet<Integer>s2=new LinkedHashSet<>();
		s2.add(1);
		s2.add(3);
		s2.add(2);
		System.out.println("Adding elements:"+s2);
		*/
		
		LinkedHashSet<Character>s3=new LinkedHashSet<>();
		s3.add('a');
		s3.add('c');
		s3.add('d');
		System.out.println("Adding elements:"+s3);
		
		s3.remove('a');
		System.out.println("Removing an element:"+s3);
		
		/*
		HashSet<Integer>s4=new HashSet<>();
		s4.add(1);
		s4.add(3);
		s4.add(2);
		System.out.println("Adding elements:"+s4);
		*/
		
		HashSet<String>s5=new HashSet<>();
		s5.add("Alice");
		s5.add("Bob");
		s5.add("Kate");
		System.out.println("Adding elements:"+s5);
		
		for(String x:s5) { 
			System.out.println("Iteration:"+x);//operation can be done in other sets(Linked hash set and Hash set)
		}
		
	}
}
