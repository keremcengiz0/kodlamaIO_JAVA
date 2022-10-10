package dayThirdHomework.part3.overriding;

public class OgretmenKrediManager extends BaseKrediManager {

	@Override
	public double hesapla(double tutar) {
		return tutar * 1.48;
	}
}
