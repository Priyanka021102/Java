package exceptionhandling;

public class trycatchfianlly {
	public static void main(String args[]) {
		try {
			System.out.println(3/0);//anything divided by 0 is error,try with 3 by 1,there will be no error
		}
		catch(Exception e) {
			System.out.println("Error Message:"+ e);
		}
		finally {
			System.out.println("Always Execute Even With Errors");
		}
	}

}

