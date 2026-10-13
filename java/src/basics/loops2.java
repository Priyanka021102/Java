package basics;

public class loops2 {
	public static void main(String args[]) {
		/** WHILE LOOP:
		even numbers between 10 to 30
		
		int ini=10;
		while(ini<=30) {
			System.out.println("Even Numbers:"+ini);
			ini=ini+2;
		}
		int ini=100;
		while(ini>=5) {
			System.out.println("Multiples of 5 in reverse order:"+ini);
			ini=ini-5;
		}
		int i=11;
		while(i<=31) {
			System.out.println("Odd numbers between 11 to 31:"+i);
			i=i+2;
		}
		
		**DO WHILE LOOP:
		
		int ini=11;
		do {
			System.out.println("Odd numbers between 11 to 1:"+ini);
			ini=ini-2;
		}
		while(ini>=1);		
	} 
	
	    **FOR LOOP:
	    
		for(int ini=1;ini<=11;ini=ini+2){
			System.out.println("Odd numbers from 1 to 11:"+ini);
		}
		
		for(int n=7;n<=140;n=n+7) {
			System.out.println("Multiples of 7:"+n);
		}*/
		
		for(int a=10;a>=0;a=a-2) {
			System.out.println("Even numbers in reverse order from 10 to 1:"+a);
		}
	}
}
