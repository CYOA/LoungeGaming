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
		
		Npc narrator = new Npc(2, "Narrator", "words");
		npcRepo.save(narrator);
		
		Dialogue d1 = new Dialogue(villageElder,1, "It gon rain");
		dialogueRepo.save(d1);
		
		Dialogue introPage = new Dialogue(narrator,2,  "Lorem ipsum dictum ullamcorper semper condimentum vivamus lacinia vehicula, tellus platea ut volutpat massa curae aliquam, curabitur nibh venenatis vitae vivamus primis quisque.\r\n" + 
				"\r\n" + 
				"Ante curabitur ut magna velit himenaeos in eget risus, condimentum faucibus interdum quisque feugiat lacinia augue, consectetur vitae neque sollicitudin donec aenean nisl est duis venenatis rutrum taciti ut rutrum sagittis non.\r\n" + 
				"\r\n" + 
				"Venenatis faucibus nisi ultrices nulla pulvinar ipsum vestibulum, dapibus porttitor quis elementum venenatis lobortis, cubilia netus mauris lobortis ipsum porttitor luctus nisi fames proin posuere semper morbi at euismod blandit nostra.\r\n" + 
				"\r\n" + 
				"Aliquet dolor iaculis tortor velit tempor etiam proin, ultrices malesuada convallis sem quisque euismod adipiscing blandit, scelerisque curae quisque massa leo curabitur convallis bibendum auctor elementum aliquam rhoncus inceptos mollis facilisis enim turpis adipiscing.\r\n" + 
				"\r\n" + 
				"Hac ultricies integer euismod suspendisse inceptos ac iaculis pellentesque posuere porttitor, vitae suspendisse metus aenean id felis proin sollicitudin euismod ullamcorper porta blandit lacus adipiscing ut tortor scelerisque ullamcorper auctor integer porta.");
		dialogueRepo.save(introPage);
		
		

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
