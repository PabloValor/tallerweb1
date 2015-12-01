package tallerweb.sangucheto.controladores;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.sangucheto.modelo.Ingrediente;
import tallerweb.sangucheto.modelo.Sanguchetto;
import tallerweb.sangucheto.modelo.Stock;
import tallerweb.sangucheto.modelo.Sanguchetto;;


@Controller
public class SanguchettoController {
	
	@ModelAttribute("cantCarrito")
	public Integer cargarCantidad() {
		Sanguchetto carrito = Sanguchetto.getInstance();
		Integer cantProductosAgregados = carrito.verIngredientes().size();
		return cantProductosAgregados;
	}

	@ModelAttribute("tabla")
	public Map<Ingrediente, Integer> mostrarTabla() {

		Stock tabla = Stock.getInstance();
		return tabla.obtenerStock();
	}

	@RequestMapping(value = "/agregarStock")
	public ModelAndView devolver() {
		return new ModelAndView("agregarStock", "command", new Ingrediente());
	}

	@RequestMapping(value = "/insertarStock", method = RequestMethod.POST)
	public String addStock(@ModelAttribute("command") Ingrediente ingrediente,
			@RequestParam("cantidad") Integer cantidad, ModelMap modelo) {
		Stock tabla = Stock.getInstance();
		tabla.agregarStock(ingrediente, cantidad);
		modelo.put("tabla", tabla.obtenerStock());
		return "agregarStock";
	}
	
	@RequestMapping("/agregarIngrediente")
	public ModelAndView insertarIngrediente() {
		return new ModelAndView("agregarIngrediente", "command", new Ingrediente());
	}
	
	@RequestMapping(value = "/insertarIngrediente", method = RequestMethod.POST)
	public String addProduct(
			@ModelAttribute("command") Ingrediente ingredienteAgregar, ModelMap modelo) {
		Stock tabla = Stock.getInstance();
		tabla.agregarIngrediente(ingredienteAgregar);
		modelo.put("tabla", tabla.listarIngredientesDisponibles());
		return "tablaIngredientes";
	}
	
	
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
