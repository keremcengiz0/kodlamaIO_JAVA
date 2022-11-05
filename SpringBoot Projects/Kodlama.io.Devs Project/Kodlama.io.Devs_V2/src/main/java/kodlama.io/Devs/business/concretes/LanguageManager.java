package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.LanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.LanguageResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

@Service
public class LanguageManager implements LanguageService {

	Logger logger = LoggerFactory.getLogger(LanguageManager.class);

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<LanguageResponse> getAll() throws Exception {
		List<Languages> languages = languageRepository.findAll();
		List<LanguageResponse> languageResponse = new ArrayList<LanguageResponse>();

		for (Languages language : languages) {
			LanguageResponse responseItem = new LanguageResponse();
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			languageResponse.add(responseItem);
		}

		return languageResponse;
	}

	@Override
	public void add(LanguageRequest languageRequest) throws Exception {
		if (isNameExist(languageRequest)) {
			throw new Exception("Programlama dili tekrar edemez!");
		}

		if (isIdExist(languageRequest.getId())) {
			throw new Exception("Id numarasi tekrar edemez!");
		}

		if (languageRequest.getName().isEmpty()) {
			throw new Exception("Isim bos birakilamaz!");
		}

		Languages language = new Languages();
		language.setId(languageRequest.getId());
		language.setName(languageRequest.getName());
		languageRepository.save(language);
		logger.trace(languageRequest.getId() + " numarali" + languageRequest.getName()
				+ " isimli programlama dili basariyla eklendi.");
	}

	@Override
	public void update(LanguageRequest languageRequest, int id) throws Exception {
		if (isNameExist(languageRequest)) {
			throw new Exception("Programlama dili tekrar edemez!");
		}

		if (!isIdExist(id)) {
			throw new Exception("Id numarasi bulunamadi!");
		}

		Languages language = languageRepository.findById(id);
		language.setName(languageRequest.getName());
		languageRepository.save(language);
		logger.trace("Programlama dili basariyla guncellendi.");
	}

	@Override
	public void delete(int id) throws Exception {
		if (!isIdExist(id)) {
			throw new Exception("Id bulunamadi!");
		}

		languageRepository.deleteById(id);
		logger.trace("Programlama dili basariyla silindi.");

	}

	@Override
	public Languages getById(int getElementId) throws Exception {
		if (!isIdExist(getElementId)) {
			throw new Exception("Id bulunamadi!");
		}

		logger.trace("Programlama dili basariyla getirildi.");
		return languageRepository.findById(getElementId);
	}

	public boolean isNameExist(LanguageRequest languageRequest) {
		for (Languages lang : languageRepository.findAll()) {
			if (lang.getName().equalsIgnoreCase(languageRequest.getName())) {
				return true;
			}
		}

		return false;
	}

	public boolean isIdExist(int id) {
		for (Languages ids : languageRepository.findAll()) {
			if (ids.getId() == id) {
				return true;
			}
		}

		return false;
	}

	@Override
	public LanguageResponse getResponseById(int id) {
		Languages language = languageRepository.findById(id);
		LanguageResponse languageResponse = new LanguageResponse();
		languageResponse.setName(language.getName());
		languageResponse.setId(language.getId());

		return languageResponse;
	}

}
