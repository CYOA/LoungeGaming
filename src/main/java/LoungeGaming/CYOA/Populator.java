package LoungeGaming.CYOA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

	@Resource
	private HeroRepository heroRepo;
	@Resource
	private OptionRepository optionRepo;
	@Resource
	private NpcRepository npcRepo;
	
	@Resource DialogueRepository dialogueRepo;

	@Override
	public void run(String... args) throws Exception {
		
		Npc villageElder = new Npc(1, "Village Elder", "words");
		npcRepo.save(villageElder);
		
		Dialogue d1 = new Dialogue(villageElder, "It gon rain");
		dialogueRepo.save(d1);
		
		

		Hero character1 = new Hero(1, "Bob", 100, " Hi my name is Bob", "/images/knight.png");
		heroRepo.save(character1);
		
		/***************
		 * Introduction
		 ****************/
		Collection<Option> children1 = new ArrayList<Option>();
		Option parent1 = new Option("what do i do?", null, children1);
		optionRepo.save(parent1);

		Option childA = new Option("left", parent1, null);
		optionRepo.save(childA);
		Option childB = new Option("right", parent1, null);
		optionRepo.save(childB);

		children1.add(childA);
		children1.add(childB);

	}

}
