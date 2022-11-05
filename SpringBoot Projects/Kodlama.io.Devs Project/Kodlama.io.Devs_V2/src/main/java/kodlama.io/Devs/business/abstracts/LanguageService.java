package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.LanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.LanguageResponse;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

public interface LanguageService {

	List<LanguageResponse> getAll() throws Exception;

	LanguageResponse getResponseById(int id);
	
	void add(LanguageRequest languageRequest) throws Exception;

	void update(LanguageRequest languageRequest, int id) throws Exception;

	void delete(int id) throws Exception;

	Languages getById(int getElementId) throws Exception;

}
