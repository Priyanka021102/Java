package Interface;

public class class1 implements interface1{
	public static void main(String args[]) {
		class1 obj=new class1();
		obj.nonstaticmethod();
		obj.abstractmethod();
		
	}
	public void abstractmethod() {
		System.out.print("abstractmethod in class");
	}
}
