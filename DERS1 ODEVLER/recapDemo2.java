package ders1_introduction;

public class recapDemo2 {

	public static void main(String[] args) {
		/*
		 * double[] myList = new double[] {1.2,1.3,4.3,5.6};
		 * System.out.println(myList[3]);
		 */
		double[] myList = { 1.2, 12.2, 4.3, 5.6 };
		double total = 0;
		double enBuyuk = myList[0];

		for (double number : myList) {
			if (enBuyuk < number) {
				enBuyuk = number;
			}
			total += number;
			System.out.println(number);
		}
		System.out.println("Toplam: " + total);
		System.out.println("En buyuk sayi: " + enBuyuk);
	}
}
