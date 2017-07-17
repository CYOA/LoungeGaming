package LoungeGaming.CYOA;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	
	@Resource	
	CharacterRepository characterRepo;

	@RequestMapping("/home")
	public String displayCharacter(Model model) {
		model.addAttribute("hero",characterRepo.findOne((long) 1));
		return "Scenario1";
	}
	
	

}
