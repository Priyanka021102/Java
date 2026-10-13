package Interface;

public interface interface1 {
	default public void nonstaticmethod() {
		System.out.println("nonstaticmethod in interface");
	}
	
	public void abstractmethod();
}
