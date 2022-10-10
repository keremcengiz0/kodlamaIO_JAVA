package ders1_introduction;

public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 22;
		int sayac=0;
		boolean varMi=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break;
			}
			sayac++;
		}
		
		if(varMi) {
			System.out.println("Aranan sayi: "+ aranacak +"'dir ve sayi " + sayac + ". indextedir.");
		}
		else {
			System.out.println("Aranan sayi dizide yoktur.");
		}
	}
}
