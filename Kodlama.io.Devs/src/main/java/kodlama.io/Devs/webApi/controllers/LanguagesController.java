package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;
	
	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<Languages> getAll() throws Exception {
		return languageService.getAll();
	}
	
	@GetMapping("/getbyid")
	public Languages getById(int id) throws Exception {
		return languageService.getById(id);
	}
	
	@PostMapping("/add")
	public void add(Languages language) throws Exception {
		languageService.add(language);
		System.out.println(language.getName() + " eklendi.");
	}
	
	@PutMapping("/update")
	public void update(Languages language, int id) throws Exception {
		languageService.update(language, id);
		System.out.println(language.getName() + " guncellendi.");
	}
	
	@DeleteMapping("/delete")
	public void delete(int id) throws Exception {
		languageService.delete(id);
		System.out.println("Programlama dili silindi.");
	}

}
