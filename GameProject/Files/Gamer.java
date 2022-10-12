package GameProject.Files;

import java.util.ArrayList;
import java.util.List;

public class Gamer {

	
	public Gamer(int id, String firstName, String lastName, int birthYear, long identityNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.identityNumber = identityNumber;
		this.setMyGames(new ArrayList<>());
	}
	
	public List<Game> getMyGames() {
		return myGames;
	}
	public void setMyGames(List<Game> myGames) {
		this.myGames = myGames;
	}

	private List<Game> myGames;
	
	private int id;
	private String firstName;
	private String lastName;
	private int birthYear;
	private long identityNumber;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public long getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(long identityNumber) {
		this.identityNumber = identityNumber;
	}
	
	
}
