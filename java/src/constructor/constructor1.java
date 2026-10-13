package constructor;

public class constructor1 {
	public static void main(String args[]) {
		constructor1 obj1=new constructor1();
		constructor1 obj2=new constructor1(2,3);//ARGUMENTS	
		constructor1 obj3=new constructor1(2,3);//new object with different arguments for same method
	}

	public constructor1(){
		System.out.println("CONSTRUCTORS...");
	}
	
	//CONSTRUCTORS WITH PARAMETERS AND ARGUMENTS
	public constructor1(int a,int b) //PARAMETERS
	{
		System.out.println("Addition:"+(a+b));
	}
	
}
