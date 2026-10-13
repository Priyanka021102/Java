package basics;

public class Introduction {
	public static void main(String args[]) {
	float len=4.5f;
	float bre=7.5f;
	System.out.println("Rectangle:"+(len*bre));
	double s=3.3;
	System.out.println("Square:"+(s*s));
	float l=3.3f;
	float b=5.6f;
	System.out.println("Triangle:"+(0.5*l*b));
	
	String a="Apple";
	String c="Apple";
	if(a!=c) {
		System.out.println("Not Same");
	}
	else{
		System.out.println("Same");
	}
	/**
	int a1=2;
	int b1=3;
	System.out.println(a1==b1? "Same": "Not Same");
	*/
	}	
}
