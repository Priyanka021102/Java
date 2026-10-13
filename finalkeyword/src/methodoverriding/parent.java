package methodoverriding;

public class parent {

//final overriding method:overriding is not possible if the method is assigned with final keyword
	final public int nonstator(int a,int b) {
		System.out.println("Overriding(Non-Static Method) in Parent Class");
		return a*b;
	}
}
