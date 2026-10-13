package superkeyword;

public class child extends parent{
	int age =20;
	public static void main(String args[]) {
		child obj= new child();
		obj.nonstaticmethod();
	}
	public void nonstaticmethod() {
		System.out.println("Parent Class Age using Super Keyword:"+super.age);
		System.out.println("Child Class Age:"+age);
	}
}
