package LoungeGaming.CYOA;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class WebController {
	
	@Resource	
	HeroRepository heroRepo;
	
	@Resource
	OptionRepository optionRepo;
	
	@Resource
	NpcRepository npcRepo;

	@Resource
	DialogueRepository dialogueRepo;
	
	@RequestMapping("/homepage")
	public String displayCharacter(Model model) {
		model.addAttribute("hero", heroRepo.findOne((long) 1));
		model.addAttribute("options", optionRepo.findAll());
		model.addAttribute("elder", npcRepo.findOne((long) 1));
//		model.addAttribute("dialogues", npcRepo.findOne((1)));
		return "homepage";
			
	}
	
	@RequestMapping("/chooseCharacter")
		public String retrieveHero(Model model) {
			model.addAttribute("hero", heroRepo.findAll());
			return "ChooseCharacter";
		}
	
	@RequestMapping("/nameCharacter")
	public String chooseName(Model model) {
		model.addAttribute("hero", heroRepo.findAll());
		return "nameCharacter";
	}
  
	@RequestMapping("/intro")
	public String displayIntro(Model model) {
		model.addAttribute("narrator", npcRepo.findOne((long)2));
		return "Intro";
	}
	@RequestMapping("/addHero")
	public String createHero(String name) {
		Hero hero = new Hero(name);
		heroRepo.save(hero); 
		return "hero";
		
}
}


