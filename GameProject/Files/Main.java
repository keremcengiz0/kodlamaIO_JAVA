package GameProject.Files;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Gamer gamer = new Gamer(1, "KEREM", "CENGIZ", 1999, 12345);
		GamerManager gamerManager = new GamerManager(new UserValidationManager());
		gamerManager.add(gamer);
		// gamerManager.delete(gamer);
	
		Game game1 = new Game(1, "LoL", 30);
		Game game2 = new Game(2, "CS GO", 80);
		Game game3 = new Game(3, "Dota", 50);
		Game game4 = new Game(4, "Call of Duty", 100);
		Game game5 = new Game(5, "PUBG", 70);
		
		Game[] gameList = new Game[] {game1,game2,game3,game4,game5};

		GameManager gameManager1 = new GameManager();
		
		for(Game game : gameList) {
			gameManager1.addGame(game);
		}
		
				
		gameManager1.gameList();
		
		gameManager1.sellGame(game2, gamer);
		gameManager1.sellGame(game5, gamer);
		gamerManager.printMyGames(gamer);
		
		
		for(Game game :gamer.getMyGames()) {
			System.out.println(gamer.getFirstName() + " adli oyuncu " + game.getGameName() + " adli oyunu " + "satin aldi");
		}
		
		
		
	}

}
