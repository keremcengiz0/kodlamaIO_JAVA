package GameProject.Files;

public class Game {
	
	public Game(int id, String gameName, int price) {
		this.id = id;
		this.gameName = gameName;
		this.price = price;
	}

	private int id;
	private String gameName;
	private int price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
