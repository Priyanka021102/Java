package basics;

public class method {
	public static void main(String args[]) {
		method.rectangle();
		method.addition();
		System.out.println("My name is:"+ method.str("Alice ","Bob"));
	}
	
	//VOID RETURN TYPE
	public static void rectangle() {
		int len=2;
		int bre=5;
		System.out.println("Area of Rectangle:"+(len*bre));
	}
	
	private static void addition() 
	{
		int a=1,b=1;
		System.out.println("Addition:"+(a+b));
	}
	
	//DATATYPE RETURN TYPE + PARAMETERS & ARGUMENTS
	public static String str(String a,String b) {
		return a+b;
	}
}
