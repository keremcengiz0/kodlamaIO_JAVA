package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

public interface LanguageService {

	List<Languages> getAll() throws Exception;

	void add(Languages language) throws Exception;

	void update(Languages language, int id) throws Exception;

	void delete(int id) throws Exception;

	Languages getById(int getElementId) throws Exception;

}
