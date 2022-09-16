package ders1_introduction;

public class switchDemo {

	public static void main(String[] args) {
		char grade = 'F';

		switch (grade) {
		case 'A':
			System.out.println("Mukemmel : Gectiniz");
			break;
		case 'B':
			System.out.println("Cok guzel : Gectiniz");
			break;
		case 'C':
			System.out.println("Iyi : Gectiniz");
			break;
		case 'D':
			System.out.println("Fena degil : Gectiniz");
			break;
		case 'F':
			System.out.println("Maalesef : Kaldiniz");
			break;
		default:
			System.out.println("Gecersiz not girdiniz");
		}
	}
}
