package net.codejava;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	@Autowired
	private DersService service;
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Ders> listDersler = service.listAll();
		model.addAttribute("listDersler",listDersler);
		return "index";
	}
	@RequestMapping("/new")
	public String showNewDersForm(Model model) {
		Ders ders = new Ders();
		model.addAttribute("ders",ders);
		return "new_ders";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveDers(@ModelAttribute("ders") Ders ders) {
		service.save(ders);
		return "redirect:/";
	}	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditDersForm(@PathVariable(name = "id") Long id) {
		ModelAndView mav = new ModelAndView("edit_ders");
		Ders ders = service.get(id);
		mav.addObject("ders", ders);
		return mav;
	}
	@RequestMapping("/delete/{id}")
	public String deleteDers(@PathVariable(name = "id") Long id) {
		service.delete(id);
		
		return "redirect:/";
	}
}
