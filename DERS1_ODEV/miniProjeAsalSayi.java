package ders1_introduction;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int sayi = 13;
		boolean asalMi = true;

		if (sayi == 1) {
			System.out.println("Sayi asal degil.");
			return;
		}

		if (sayi < 1) {
			System.out.println("Gecersiz sayi girdiniz.");
		}

		for (int i = 2; i < sayi; i++) {
			if (sayi % 2 == 0) {
				asalMi = false;
			}
		}
		if (asalMi) {
			System.out.println("Sayi asaldir.");
		} else {
			System.out.println("Sayi asal degil.");
		}
	}
}
