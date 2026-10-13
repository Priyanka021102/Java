package collectionframework;
import java.util.concurrent.ArrayBlockingQueue;;

public class arrayqueue {
	public static void main(String args[]) {
		ArrayBlockingQueue<Boolean>d=new ArrayBlockingQueue<>(4);
		d.add(true);
		d.add(false);
		d.add(true);
		d.add(false);
		System.out.println(d);
		
		d.remove(false);
		System.out.println(d);
		
		System.out.println(d.peek());
			
		for(Boolean x:d) {
			System.out.println(x);
		}
	}
	
}
