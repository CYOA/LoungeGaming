package LoungeGaming.CYOA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
public class CharacterPopulator implements CommandLineRunner {

	@Resource
	private CharacterRepository characterRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Character character1 = new Character(1,"Bob",100," Hi my name is Bob", "/images/knight.png");
		characterRepo.save(character1);
		

	}

}
