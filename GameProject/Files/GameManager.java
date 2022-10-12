package GameProject.Files;

import java.util.ArrayList;
import java.util.List;

public class GameManager implements IGameService {

	public GameManager() {
		this.games = new ArrayList<>();
	}

	List<Game> games;

	@Override
	public void sellGame(Game game, Gamer gamer) {
		gamer.getMyGames().add(game);
	}

	@Override
	public void addGame(Game game) {
		this.games.add(game);	
	}

	public void gameList() {
		for(Game game:games)
		{
			System.out.println("Id:"+ game.getId() + " Oyun adi:" + game.getGameName() + " Fiyati:" + game.getPrice() + "TL");
		}
	}
	
}
