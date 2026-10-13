package basics;

public class diffreturntype {
	public static void main(String args[]) {
		/**DIFFERENT DATATYPES INSTEAD OF VOID AS RETURN TYPE:

		System.out.println("Add:"+ diffreturntype.add());
		System.out.println("Subtract:"+ diffreturntype.sub());
		System.out.println("Product:"+ diffreturntype.pro());
		System.out.println("Name:"+ diffreturntype.str());
		System.out.println("Initial:"+ diffreturntype.character());
		System.out.println("Is she a girl?:"+ diffreturntype.bool());
	}
	public static int add(){
		int a=1,b=2;
		return a+b;
	}
	public static float sub(){
		float a=5.4f,b=2.1f;
		return a-b;
	}
	public static double pro(){
		double a=1.1,b=2.2;
		return a*b;
	}
	public static String str(){
		String a="Alice",b="Walters";
		return a+b;
	}
	public static char character(){
		char a='H';
		return a;
	}
	public static boolean bool(){
		boolean a=true;
		return a;
	}*/
		System.out.println("Area of Square:"+ diffreturntype.area());
		System.out.println("Average of two numbers:"+ diffreturntype.avg());
 }
	public static int area(){
		int a=2;
		return a*a;
	}
	public static double avg(){
		double a=2.5,b=5.2;
		return a+b/2;
	}
}
