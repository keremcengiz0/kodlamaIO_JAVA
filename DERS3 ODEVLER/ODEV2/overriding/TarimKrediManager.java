package dayThirdHomework.part3.overriding;

public class TarimKrediManager extends BaseKrediManager {
	
	@Override
	public double hesapla(double tutar) {
		return tutar * 1.28;
	}
}
