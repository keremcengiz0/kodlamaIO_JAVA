package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Languages> languages;

	public InMemoryLanguageRepository() {
		super();
		languages = new ArrayList<Languages>();
		languages.add(new Languages(1, "C#"));
		languages.add(new Languages(2, "Java"));
		languages.add(new Languages(3, "Python"));
		languages.add(new Languages(4, "JavaScript"));
		languages.add(new Languages(5, "Cpp"));

	}

	@Override
	public List<Languages> getAll() {

		return languages;
	}

	@Override
	public void add(Languages language) {
		languages.add(language);
	}

	@Override
	public void update(Languages language, int id) {
		List<Languages> languagesList = getAll();
		for (Languages languagelist : languagesList) {
			if (languagelist.getId() == id) {
				languagelist.setName(language.getName());
			}
		}

	}

	@Override
	public void delete(int id) {
		List<Languages> languagesList = getAll();
		languagesList.removeIf(languagelist -> languagelist.getId() == id);
	}

	@Override
	public Languages getById(int getElementId) {

		for (Languages lang : languages) {
			if (lang.getId() == getElementId) {
				return lang;
			}
		}
		return null;

	}

}
