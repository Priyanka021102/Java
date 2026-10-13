package builtinclasses;

public class string1 {
	public static void main(String args[]) {
		String a="Wonderful";
		System.out.println("Length/Size of the string: "+a.length());
		System.out.println("Character of the given index number 3: "+a.charAt(3));
		System.out.println("Index number of the given character: "+a.indexOf('f'));
		
		System.out.println("Changing the string to uppercase: "+a.toUpperCase());
		System.out.println("Changing the string to lowercase: "+a.toLowerCase());

		System.out.println("Replacing the character to W to l: "+a.replace('W','l'));
		//the lowercase and uppercase should not be changed,characters should be as mentioned
		
		System.out.println("Concatenating with symbol: "+a+" world");
		System.out.println("Concatenating with method: "+a.concat(" world"));
		
		System.out.println("Printing characters from 3 to 6: "+a.substring(3,6));//ending value is exclusive
		System.out.println("Finding the characters in the given string: "+a.contains("ful"));//single character is not allowed
		System.out.println("Finding the characters in the given string: "+a.contains("more"));
		

	}

}
