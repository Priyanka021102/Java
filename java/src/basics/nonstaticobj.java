package basics;

public class nonstaticobj {
	public static void main(String args[]) {
		// NON STATIC METHOD:
		//VOID RETURN TYPE + NONSTATIC
		nonstaticobj obj1=new nonstaticobj();
		obj1.student();
		obj1.course();
		
		
		//DATATYPE RETURN TYPE + PARAMETERS & ARGUMENTS
		nonstaticobj obj2=new nonstaticobj();
		System.out.println("Name:"+obj2.str("Alice", "Bob"));
		System.out.println("Marks:"+obj2.float1(9.23f,3.33f));
		
		//VOID RETURN TYPE + PARAMETERS & ARGUMENTS 
		nonstaticobj obj3=new nonstaticobj();
		obj3.multiply(4);
		
		//DATATYPE RETURN TYPE + NONSTATIC
		nonstaticobj obj4=new nonstaticobj();
		System.out.println("Are you gay?"+obj4.bool());	
		System.out.println(obj4.bool());
		
		nonstaticobj obj5=new nonstaticobj();
		System.out.println(obj5.cube());
	}
	
	
	//VOID RETURN TYPE + NONSTATIC
	public void student(){
		String name="Alice";
		int age=19;
		double marks=60.5;
		System.out.println("STUDENT AND COURSE DETAILS");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Percentage:"+marks+'%');
	}
	private void course() {
		String course="MCA";
		int duration=2;
		System.out.println("Course:"+course);
		System.out.println("Duration:"+duration+"yrs");
	}
	
	
	//DATATYPE RETURN TYPE + PARAMETERS & ARGUMENTS
	public String str(String a,String b) {
		return a+b;
	}
	public float float1(float a,float b) {
		return a+b;
	}
	
	//VOID RETURN TYPE + PARAMETERS & ARGUMENTS
	public void multiply(int a){
		System.out.println(a*a);
	}
	
	
	//DATATYPE RETURN TYPE + NONSTATIC
	public boolean bool() {
		boolean a=true;
		return a;
	}
	public int cube() {
		int a=10;
		return a*a*a;
	}
}
