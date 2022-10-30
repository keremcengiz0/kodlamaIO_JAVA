package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

public interface LanguageRepository {

	List<Languages> getAll();

	void add(Languages languages);

	void update(Languages languages, int id);

	void delete(int id);

	Languages getById(int getElementId);

}
