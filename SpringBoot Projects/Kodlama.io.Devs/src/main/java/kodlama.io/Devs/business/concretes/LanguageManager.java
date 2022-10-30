package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
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
	public List<Languages> getAll() throws Exception {
		logger.trace("Programlama dilleri listelendi.");
		return languageRepository.getAll();
	}

	@Override
	public void add(Languages language) throws Exception {
		if(isNameExist(language)) {
			throw new Exception("Programlama dili tekrar edemez!");
		}
		
		if(isIdExist(language.getId())) {
			throw new Exception("Id numarasi tekrar edemez!");
		}
		
		if(language.getName().isEmpty()) {
			throw new Exception("Isim bos birakilamaz!");
		}
		
		languageRepository.add(language);
		logger.trace(language.getId() + " numarali" + language.getName() + " isimli programlama dili basariyla eklendi.");
	}

	@Override
	public void update(Languages language, int id) throws Exception {
		if(isNameExist(language)) {
			throw new Exception("Programlama dili tekrar edemez!");
		}
		
		if(!isIdExist(id)) {
			throw new Exception("Id numarasi bulunamadi!");
		}
		
		languageRepository.update(language, id);
		logger.trace("Programlama dili basariyla guncellendi.");

	}

	@Override
	public void delete(int id) throws Exception {
		if(!isIdExist(id)) {
			throw new Exception("Id bulunamadi!");
		}
		
		languageRepository.delete(id);
		logger.trace("Programlama dili basariyla silindi.");

	}

	@Override
	public Languages getById(int getElementId) throws Exception {
		if(!isIdExist(getElementId)) {
			throw new Exception("Id bulunamadi!");
		}
		
		logger.trace("Programlama dili basariyla getirildi.");
		return languageRepository.getById(getElementId);
	}

	public boolean isNameExist(Languages language) {
		for (Languages lang : languageRepository.getAll()) {
			if (lang.getName().equalsIgnoreCase(language.getName())) {
				return true;
			}
		}

		return false;
	}

	public boolean isIdExist(int id) {
		for (Languages ids : languageRepository.getAll()) {
			if (ids.getId() == id) {
				return true;
			}
		}

		return false;
	}

}
