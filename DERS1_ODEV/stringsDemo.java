package ders1_introduction;

public class stringsDemo {

	public static void main(String[] args) {
		//String mesaj = "Bugun hava cok guzel.";
		String mesaj = "	Bugun hava cok guzel.	";
		System.out.println(mesaj);
		
		/*
		System.out.println("Eleman sayisi: " + mesaj.length());
		System.out.println("5. eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat("Yasasin!"));
		String mesaj2 = mesaj.concat("Yasasinnn!");
		System.out.println(mesaj2);
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf('u'));
		*/
		
		String yeniMesaj = mesaj.replace("guzel", "kotu");
		System.out.println(yeniMesaj);
		System.out.println(yeniMesaj.replace(" ", "-"));
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());

	}
}
 