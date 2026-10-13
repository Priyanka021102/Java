package builtinclasses;

 import java.util.Scanner;

public class scanner {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=s.nextLine();
		
		System.out.println("Enter ID:");
		int id=s.nextInt();
		System.out.println("Enter GPA:");
		float gpa=s.nextFloat();
		System.out.println("Enter Percentage:");
		double percentage=s.nextDouble();
		System.out.println("Your Name is: "+name);
		System.out.println("Your ID is: "+id);
		System.out.println("Your GPA is: "+gpa);
		System.out.println("Your Percentage is: "+percentage+"%");
	}

}
