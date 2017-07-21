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
	
	
	@RequestMapping("/intro")
	public String displayIntro(Model model) {
		model.addAttribute("narrator0", npcRepo.findOne((long) 0));
		//Narrator2 text should replace Narrator text after a short period of time
		model.addAttribute("narrator1", npcRepo.findOne((long) 1));
		return "Intro";
	}
	
	@RequestMapping("/chooseCharacter")
		public String retrieveHero(Model model) {
			model.addAttribute("hero", heroRepo.findAll());
			return "test";
		}
	
	@RequestMapping("/nameCharacter")
	public String chooseName(Model model) {
		model.addAttribute("hero", heroRepo.findAll());
		return "nameCharacter";
	}

}


