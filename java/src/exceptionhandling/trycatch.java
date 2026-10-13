package exceptionhandling;

public class trycatch {
	public static void main(String args[]) {
		try {
			System.out.println(3/0);
		}
		catch(Exception e) {
			System.out.println("Error Message:" + e);
		}
	}

}
