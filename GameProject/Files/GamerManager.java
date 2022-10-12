package GameProject.Files;

public class GamerManager implements IGamerService {
	IUserValidationService userValidationService;

	public GamerManager(IUserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if (userValidationService.Validate(gamer)) {
			System.out.println("Kayit basarili");
		} else {
			System.out.println("Dogrulama basarisiz, kayit basarisiz.");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kayit guncellendi");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kayit silindi");
	}
	
	public void printMyGames(Gamer gamer) {
		for(Game myGame : gamer.getMyGames()) {
			System.out.println(gamer.getFirstName() + " adli oyuncunun sahip oldugu oyunlar: " +  myGame.getGameName());
		}
	}

}
