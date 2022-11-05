package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

public interface LanguageRepository extends JpaRepository<Languages, Integer>{
	
	Languages findById(int id);
	Languages findByName(String name);

}
