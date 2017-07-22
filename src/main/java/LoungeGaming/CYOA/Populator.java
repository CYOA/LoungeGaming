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
	@Resource 
	DialogueRepository dialogueRepo;

	@Override
	public void run(String... args) throws Exception {
		
		/***********************************************
		 * Narrator NPCs and Accompanying Dialogue 0-20
		 *********************************************/
		
		
		Npc narrator = new Npc(0, "Narrator0", "image address here");
		npcRepo.save(narrator);
		
		
		Dialogue introPage = new Dialogue(narrator,	2, "Word is ringing out from the Great City "
				+ "that an ominous gate has appeared in the center of the city. As people gathered "
				+ "to marvel, a single figure stepped forth from the gate. Cloaked and forboding, "
				+ "he declared the world would end in seven days.");
		dialogueRepo.save(introPage);
		
		/**/
		
		Npc narrator1 = new Npc(1, "Narrator1", "image address here");
		npcRepo.save(narrator1);
		
		Dialogue introPage2 = new Dialogue(narrator1, 3, "In a small village outside the city, a village "
				+ "elder gathers everyone together to share the grim news. While he seems resigned to their fate,"
				+ "there is one villager who is not...");
		dialogueRepo.save(introPage2);
		
		/************************************************
		 * VillageElder and Accompanying Dialogue
		 **********************************************/
		
		Npc villageElder = new Npc(1, "Village Elder", "image address here");
		npcRepo.save(villageElder);
		
		Dialogue d1 = new Dialogue(villageElder,1, "Do not despair in these dark times. We must be there for"
				+ "while we wait out our remaining days");
		dialogueRepo.save(d1);
		
		/************************************************
		 * Hero object(s) removed this to create a controller
		 **********************************************/
		
		
		/*Hero character1 = new Hero(1, "Bob", 100, " Hi my name is Bob", "/images/knight.png");
		heroRepo.save(character1);*/
		
		/***************
		 * Testing
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
