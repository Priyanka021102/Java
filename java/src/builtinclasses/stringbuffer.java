package builtinclasses;

public class stringbuffer {
	public static void main(String args[]) {
		StringBuffer a=new StringBuffer("Vegetable");
		System.out.println("Length/Size of the string: "+a.length());
		System.out.println("Character of the given index number: "+a.charAt(3));
		System.out.println("Index number of the given character: "+a.indexOf("b"));//should be in double quotes
		
		System.out.println("Adding a string: "+a.append("diet"));
		
		System.out.println("Inserting a character in the specified index number: "+a.insert(3,"z"));//should be in double quotes
		
		System.out.println("Deleting the character with the index number: "+a.deleteCharAt(2));
		System.out.println("Deleting the sequence of characters with the index number: "+a.delete(0,4));
		//end value is exclusive
		
		System.out.println("Replacing the string with the index number and string:"+a.replace(0,5,"Heavy"));
		//end value is exclusive		
		System.out.println("Reversing the string:"+a.reverse());
	}
}
