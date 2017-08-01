package LoungeGaming.CYOA;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

		// model.addAttribute("dialogues", npcRepo.findOne((1)));
		return "homepage";

	}

	@RequestMapping("/nameCharacter")
	public String chooseName(Model model) {
		model.addAttribute("hero", heroRepo.findAll());
		return "nameCharacter";

	}

	@RequestMapping("/intro")
	public String displayIntro(Model model) {
		model.addAttribute("narrator0", npcRepo.findOne((long) 0));
		// Narrator2 text should replace Narrator text after a short period of
		// time
		model.addAttribute("narrator1", npcRepo.findOne((long) 1));

		return "intro";
	}

	@RequestMapping("/addHero")
	public String createHero(@RequestParam(value = "heroName") String heroName, Model model) {
		Hero hero = new Hero(heroName);
		heroRepo.save(hero);
		model.addAttribute("hero", heroRepo.findOne((long) 1));
		return "redirect:/startQuest";

	}

	@RequestMapping("/chooseCharacter")
	public String retrieveHero(Model model) {
		model.addAttribute("hero", heroRepo.findAll());
		return "chooseCharacter";
	}

	@RequestMapping("/startQuest")
	public String startQuest(Model model) {
		model.addAttribute("hero", heroRepo.findAll());
		return "StartQuest2";
	}

	@RequestMapping("/destination")
	public String chooseDestination(Model model) {
		model.addAttribute("hero", heroRepo.findAll());
		return "destination";
	}

	/********************************
	 * Forest Event RequestMapping
	 *********************************/

	@RequestMapping("/forestSetting")
	public String displayForestExpo(Model model) {
		return "forestSetting";
	}

	@RequestMapping("/forestEventA")
	public String displayForestEventA(Model model) {
		return "forestEventA";
	}

	@RequestMapping("/forestEventAcamp")
	public String displayForestEventAcamp(Model model) {
		return "forestEventAcamp";
	}

	@RequestMapping("/forestEventApush")
	public String displayForestEventApush(Model model) {
		return "forestEventApush";
	}

	@RequestMapping("/forestEventB")
	public String displayForestEventB(Model model) {
		return "forestEventB";
	}

	
		@RequestMapping("/forestEventBfight")
		public String displayForestEventBfight(Model model) {
			return "forestEventBfight";
		}
	
		@RequestMapping("/forestEventBflee")
		public String displayForestEventBflee(Model model) {
			return "forestEventBflee";
		}
	
	
/***********************
 * Countryside Event
 ************************/
	
	@RequestMapping("/countrysideSetting")
	public String displayCountrysideSetting(Model model) {
		return "countrysideSetting";
	}

	@RequestMapping("/countrysideEventA")
	public String displayCountrysideEventA(Model model) {
		return "countrysideEventA";
	}

//		@RequestMapping("/countrysideEventAapproach")
//		public String displayCountrysideEventAApproach(Model model) {
//			return "countrysideEventAapproach";
//		}
	
		@RequestMapping("/countrysideEventAhide")
		public String displayCountrysideEventAHide(Model model) {
			return "countrysideEventAhide";
		}

	@RequestMapping("/countrysideEventB")
	public String displayCountrysideEventB(Model model) {
		return "countrysideEventB";
	}
	
//		@RequestMapping("/countrysideEventBfight")
//		public String displayCountrysideEventBFight(Model model) {
//			return "countrysideEventBfight";
//		}

		@RequestMapping("/countrysideEventBtalk")
		public String displayCountrysideEventBTalk(Model model) {
			return "countrysideEventBtalk";
		}

	
}
	
	
