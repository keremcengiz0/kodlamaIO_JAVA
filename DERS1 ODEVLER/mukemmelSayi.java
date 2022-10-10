package ders1_introduction;

public class mukemmelSayi {

	public static void main(String[] args) {
		int sayi=10;
		int toplam=0;
		
		for(int i=1; i<sayi; i++) {
			if(sayi%i==0) {
				toplam +=i;
			}
		}
		
		if(toplam==sayi) {
			System.out.println("Sayi mukemmeldir.");
		}
		else {
			System.out.println("Sayi mukemmel degildir.");
		}
		
	}
}
