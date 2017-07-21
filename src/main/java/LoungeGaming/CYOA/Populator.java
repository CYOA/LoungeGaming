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
		
		Npc narrator = new Npc(2, "Narrator", "image address");
		npcRepo.save(narrator);
		
		Dialogue d1 = new Dialogue(villageElder,1, "It gon rain");
		dialogueRepo.save(d1);
		
		Dialogue introPage = new Dialogue(narrator,	2, "Word is ringing out from the Great City "
				+ "that an ominous gate has appeared in the center of the city. As people gathered "
				+ "to marvel, a single figure stepped forth from the gate. Cloaked and forboding, "
				+ "he declared the world would end in seven days.");
		dialogueRepo.save(introPage);
		
		Npc narrator2 = new Npc(3, "Narrator2", "image address");
		npcRepo.save(narrator2);
		
		Dialogue introPage2 = new Dialogue(narrator2, 3, "In a small village outside the city, a village "
				+ "elder gathers everyone together to share the grim news. While he seems resigned to their fate,"
				+ "there is one villager who is not...");
		dialogueRepo.save(introPage2);
		
		

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
