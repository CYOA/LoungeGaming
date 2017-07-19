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

	@RequestMapping("/home")
	public String displayCharacter(Model model) {
		model.addAttribute("hero",heroRepo.findOne((long) 1));
		model.addAttribute("options", optionRepo.findAll());
		return "ChooseCharacter";
	}
	
	

}
