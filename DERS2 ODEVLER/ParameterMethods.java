package ders1_homework;

public class ParameterMethods {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int toplama = topla(57, 34);
		System.out.println(toplama);
		int toplam = topla2(1, 2, 3, 4, 5, 6);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");

	}

	public static void guncelle() {
		System.out.println("Guncellendi");

	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		/*
		 * for(int i=0; i<sayilar.length; i++) { toplam+=sayilar[i]; }
		 */
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Istanbul";
	}

}
