package exceptionhandling;
import java.util.Scanner;

public class throwkeyword {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter Your Age:");
		int age=s.nextInt();
		if(age>18) {
			System.out.println("Adult");
		}
		else {
			throw new ArithmeticException("Minor");
		}
	}

}

/*
 * import java.util.IOException;
 * public class throwexception{
 * public static void main(String args[])throws IOException{
 *   //main method => throws exceptioname
 *  
 */