package ders1_homework;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca(66);
	}

	public static void sayiBulmaca(int aranacakSayi) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = aranacakSayi;
		int sayac = 0;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
			sayac++;
		}

		if (varMi) {
			mesajVer("Aranan sayi: " + aranacak + "'dir ve sayi " + sayac + ". indextedir.");
		} else {
			mesajVer("Aranan sayi dizide yoktur.");
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
