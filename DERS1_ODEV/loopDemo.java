package ders1_introduction;

public class loopDemo {

	public static void main(String[] args) {
		//For
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("For dongusu bitti.\n");
		
		//While
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While dongusu bitti.\n");
		
		//Do While
		int j=1;
		do {
			System.out.println(j);
			j++;
		} while(j<=10);	
		System.out.println("Do While dongusu bitti.");
	}
}
