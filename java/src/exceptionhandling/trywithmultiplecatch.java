package exceptionhandling;

public class trywithmultiplecatch {
	public static void main(String args[]) {
		try {
			//System.out.println(3/0);
			String name="Alice";
			System.out.println(name.charAt(10));
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Index is out of limit");
		}
	}

}

