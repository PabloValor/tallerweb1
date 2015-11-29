package tallerweb.sangucheto.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.sangucheto.modelo.Ingrediente;
import tallerweb.sangucheto.modelo.Sanguchetto;


@Controller
public class SanguchettoController {
	@RequestMapping("/home")
	public ModelAndView Home() {
		
		Sanguchetto sanguchetto = Sanguchetto.getInstance();
		
		Ingrediente ingrediente1 = new Ingrediente();
		ingrediente1.setNombre("Lechuga");
		
		Ingrediente ingrediente2 = new Ingrediente();
		ingrediente2.setNombre("Tomate");
		
		sanguchetto.agregarIngrediente(ingrediente1);
		sanguchetto.agregarIngrediente(ingrediente2);
		
		ModelAndView mav = new ModelAndView("home");
		
		mav.addObject("model", sanguchetto.verIngredientes());
		
		return mav;
	}
}
