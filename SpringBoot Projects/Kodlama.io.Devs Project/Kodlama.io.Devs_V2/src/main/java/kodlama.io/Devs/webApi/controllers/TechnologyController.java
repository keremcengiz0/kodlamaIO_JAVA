package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.TechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.TechnologyResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {

	private TechnologyService technologyService;
	
	@Autowired
	public TechnologyController(TechnologyService technologyService) {
		this.technologyService = technologyService;
	}

	
	@GetMapping("/getall")
	public List<TechnologyResponse> getAll() {
		return technologyService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody TechnologyRequest technologyRequest) throws Exception {
		technologyService.add(technologyRequest);
	}
	
	@PutMapping("/update/{id}")
	public void update(@RequestBody TechnologyRequest technologyRequest, @PathVariable int id) throws Exception {
		technologyService.update(technologyRequest,id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		technologyService.delete(id);
	}

}
