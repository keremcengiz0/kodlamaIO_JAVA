package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.TechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.TechnologyResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {

	private TechnologyRepository technologyRepository;
	private LanguageService languageService;

	public TechnologyManager(TechnologyRepository technologyRepository, LanguageService languageService) {
		super();
		this.technologyRepository = technologyRepository;
		this.languageService = languageService;
	}

	@Override
	public List<TechnologyResponse> getAll() {

		List<Technology> technologies = technologyRepository.findAll();
		List<TechnologyResponse> responses = new ArrayList<>();

		for (Technology technology : technologies) {
			TechnologyResponse technologyResponse = new TechnologyResponse();
			technologyResponse.setId(technology.getId());
			technologyResponse.setProgrammingLanguageId(technology.getLanguages().getId());
			technologyResponse.setName(technology.getName());
			responses.add(technologyResponse);
		}

		return responses;
	}

	@Override
	public void add(TechnologyRequest technologyRequest) throws Exception {

		Technology technology = new Technology();
		Languages language = languageService.getById(technologyRequest.getProgrammingLanguageId());
		technology.setName(technologyRequest.getName());
		technology.setLanguages(language);
		technologyRepository.save(technology);

	}

	@Override
	public void update(TechnologyRequest technologyRequest, int id) throws Exception {

		Technology updateTechnology = technologyRepository.findById(id);
		Languages updateLanguageId = languageService.getById(technologyRequest.getProgrammingLanguageId());
		updateTechnology.setName(technologyRequest.getName());
		updateTechnology.setLanguages(updateLanguageId);
		technologyRepository.save(updateTechnology);
	}

	@Override
	public void delete(int id) {
		technologyRepository.deleteById(id);
	}


}
