package ders1_homework;

public class InheritanceDemoTest {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		//ogretmenKrediManager.Hesapla();
		//TarimKrediManager tarimKrediManager = new TarimKrediManager();
		//AskerKrediManager askerKrediManager = new AskerKrediManager();
		/*
		 * KrediUI krediUI = new KrediUI(); krediUI.KrediHesapla(new OgretmenKrediManager());
		 */
		
			KrediUI krediUI = new KrediUI();
			//krediUI.KrediHesapla(tarimKrediManager);
			//krediUI.KrediHesapla(askerKrediManager);
			krediUI.KrediHesapla(new AskerKrediManager());
	}

}
