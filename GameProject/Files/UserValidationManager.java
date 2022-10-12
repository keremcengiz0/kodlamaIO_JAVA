package GameProject.Files;

public class UserValidationManager implements IUserValidationService {

	@Override
	public boolean Validate(Gamer gamer) {
		if (gamer.getBirthYear() == 1999 && gamer.getFirstName() == "KEREM" && gamer.getLastName() == "CENGIZ" && gamer.getIdentityNumber() == 12345) {
			return true;
		} else {
			return false;
		}
	}

}
