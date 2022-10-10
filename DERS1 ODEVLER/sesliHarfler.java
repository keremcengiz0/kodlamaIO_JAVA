package ders1_introduction;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf ='A';
		
		switch(harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalin sesli harf");
				break;
			default:
				System.out.println("Ince sesli harf");
		}
	}
}
