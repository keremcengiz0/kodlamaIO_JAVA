package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.TechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.TechnologyResponse;

public interface TechnologyService {
	List<TechnologyResponse> getAll();
	void add(TechnologyRequest technologyRequest) throws Exception;
	void update(TechnologyRequest technologyRequest, int id) throws Exception;
	void delete(int id);
	
}
