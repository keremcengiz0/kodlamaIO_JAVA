package dayThirdHomework.part4.abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		GameCalculator[] gameCalculator = new GameCalculator[] {new ManGameCalculator(),new WomanGameCalculator(), new KidsGameCalculator()};
		
		for(GameCalculator gameCalculators : gameCalculator) {
			gameCalculators.hesapla();
			gameCalculators.gameOver();
		}
		
	}

}
