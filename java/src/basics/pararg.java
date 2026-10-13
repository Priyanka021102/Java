package basics;

public class pararg {
	public static void main(String args[]) {
		//STATIC METHOD:
		// VOID RETURN TYPE + PARAMETERS & ARGUMENTS
		pararg.multiply(4);//argument
		
		//DATATYPE RETURN TYPE WITH PRINT STATEMENT + PARAMETERS & ARGUMENTS
		System.out.println("Multiplication: "+pararg.integer(4,3));
		
		
		/* DATATYPE RETURN TYPE*/
		System.out.println("String: "+pararg.str("I love India"));
		System.out.println("Character: "+pararg.character('K'));
		System.out.println("Boolean: "+pararg.bool(false));
	}
	//VOID RETURN TYPE + PARAMETERS & ARGUMENTS
	public static void multiply(int a)//parameter 
	{
		System.out.println(a*a);
	}
	
	
	// DATATYPE RETURN TYPE + PARAMETERS & ARGUMENTS
	public static int integer(int a,int b)//parameter 
	{
		return a*b;
	}
	public static String str(String a)//parameter 
	{
		return a;
	}
	public static char character(char a)//parameter 
	{
		return a;
	}
	public static boolean bool(boolean a)//parameter 
	{
		return a;
	}

}
