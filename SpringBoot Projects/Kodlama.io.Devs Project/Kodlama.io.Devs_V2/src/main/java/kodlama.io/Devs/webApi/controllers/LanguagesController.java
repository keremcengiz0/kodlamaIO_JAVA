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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.LanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.LanguageResponse;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;
	
	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<LanguageResponse> getAll() throws Exception {
		return languageService.getAll();
	}
	
	@GetMapping("/getbyid")
	public LanguageResponse getById(@RequestParam int id) throws Exception {
		return languageService.getResponseById(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody LanguageRequest languageRequest) throws Exception {
		languageService.add(languageRequest);
		System.out.println(languageRequest.getName() + " eklendi.");
	}
	
	@PutMapping("/update")
	public void update(@RequestBody LanguageRequest languageRequest, @PathVariable int id) throws Exception {
		languageService.update(languageRequest, id);
		System.out.println(languageRequest.getName() + " guncellendi.");
	}
	
	@DeleteMapping("/delete")
	public void delete(@PathVariable int id) throws Exception {
		languageService.delete(id);
		System.out.println("Programlama dili silindi.");
	}

}
