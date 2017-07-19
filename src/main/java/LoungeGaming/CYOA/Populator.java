package LoungeGaming.CYOA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

	@Resource
	private HeroRepository heroRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Hero character1 = new Hero(1, "Bob", 100, " Hi my name is Bob", "/images/knight.png");
		heroRepo.save(character1);
	

	}

}
