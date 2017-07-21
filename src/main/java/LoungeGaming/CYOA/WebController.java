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
		return "homepage";

	}

	@RequestMapping("/intro")
	public String displayIntro(Model model) {
		model.addAttribute("narrator0", npcRepo.findOne((long) 0));
		// Narrator2 text should replace Narrator text after a short period of
		// time
		model.addAttribute("narrator1", npcRepo.findOne((long) 1));
		return "Intro";
	}

	@RequestMapping("/chooseCharacter")
	public String retrieveHero(Model model) {
		model.addAttribute("hero", heroRepo.findAll());
		return "chooseCharacter";
	}

	
	@RequestMapping("/nameCharacter")
	public String addName(Model model) {
		model.addAttribute("hero", heroRepo.findAll());
		return "nameCharacter";
	}

/*	@RequestMapping("/nameCharacter")
	public String addHero(@RequestParam(value = "id") Long id, String name) {
		Hero hero = new Hero();
		heroRepo.save(hero);
		return "nameCharacter";
	}*/

	@RequestMapping("/nameHero")
	public String createHero(Long id, String name) {
		Hero hero = new Hero(name);
		heroRepo.save(hero);
		return "redirect:/nameCharacter?id=" + id;

	}

}
