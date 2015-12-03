package tallerweb.sangucheto.controladores;

import java.util.Iterator;
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
import tallerweb.sangucheto.modelo.Sanguchetto;
import tallerweb.sangucheto.modelo.Descuento;


@Controller
public class SanguchettoController {
	
	@ModelAttribute("cantProductosAgregados")
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
	
	
	@RequestMapping(value = "/stockExistentes")
	public ModelAndView stockExistentes() {
		ModelMap miMapa = new ModelMap();
		Stock tabla = Stock.getInstance();
		miMapa.put("tabla", tabla.obtenerStock());
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(miMapa);
		miVista.setViewName("mostrarStock");
		return miVista;

	}

	@RequestMapping("/eliminarIngrediente")
	public ModelAndView eliminarIngrediente() {
		return new ModelAndView("eliminarIngredientes", "command", new Ingrediente());
	}

	@RequestMapping(value = "/eliminarIng", method = RequestMethod.POST)
	public String eliminarIngredientes(
			@ModelAttribute("command") Ingrediente ingrediente, ModelMap modelo) {
		Stock tabla = Stock.getInstance();
		tabla.eliminarIngrediente(ingrediente);
		modelo.put("tabla", tabla.obtenerStock());
		return "eliminarIngredientes";
	}

	@RequestMapping(value = "/agregarAlCarrito")
	public ModelAndView agregarAlcarrito() {
		ModelMap miMapa = new ModelMap();
		Stock tabla = Stock.getInstance();
		miMapa.put("tabla", tabla.obtenerStock());
		ModelAndView miVista = new ModelAndView("agregarAlCarrito", "command",
				new Ingrediente());
		miVista.addAllObjects(miMapa);
		return miVista;
	}

	@RequestMapping(value = "/insertarProductoAlCarrito", method = RequestMethod.POST)
	public ModelAndView addProductToCarrito(
			@ModelAttribute("command") Ingrediente productoAgregar, ModelMap modelo) {
		Sanguchetto carrito = Sanguchetto.getInstance();
		carrito.agregarIngrediente(productoAgregar);
		Double total = new Double(0);
		Double totalDescuento = new Double(0);
		Double totalAhorrado = new Double(0);
		total = carrito.totalSinDescuentos();
		totalDescuento = carrito.total();
		totalAhorrado = carrito.totalAhorros();
		modelo.put("total", total);
		modelo.put("totalDescuento", totalDescuento);
		modelo.put("totalAhorrado", totalAhorrado);
		modelo.put("tabla", carrito.verIngredientes());
		modelo.put("cantProductosAgregados", carrito.verIngredientes().size());
		Stock tabla = Stock.getInstance();
		tabla.agregarStock(productoAgregar, -1);
		modelo.put("tabla", carrito.verIngredientes());
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(modelo);
		miVista.setViewName("carrito");
		return miVista;
	}

	@RequestMapping("/vaciarCarrito")
	public ModelAndView vaciarCarrito() {
		ModelMap miMapa = new ModelMap();

		Sanguchetto carrito = Sanguchetto.getInstance();
		Stock stock = Stock.getInstance();
		Iterator<Ingrediente> iterator = carrito.verIngredientes().iterator();

		while (iterator.hasNext()) {
			Ingrediente cadaElemento = iterator.next();
			stock.agregarStock(cadaElemento, 1);
		}

		carrito.vaciar();
		miMapa.put("cantProductosAgregados", carrito.verIngredientes().size());
		miMapa.put("tabla", carrito.verIngredientes());
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(miMapa);
		miVista.setViewName("carrito");
		return miVista;

	}

	@RequestMapping(value = "/carrito")
	public ModelAndView carrito() {
		ModelMap miMapa = new ModelMap();
		Sanguchetto tabla = Sanguchetto.getInstance();
		Double total = new Double(0);
		Double totalDescuento = new Double(0);
		Double totalAhorrado = new Double(0);
		total = tabla.totalSinDescuentos();
		totalDescuento = tabla.total();
		totalAhorrado = tabla.totalAhorros();
		miMapa.put("total", total);
		miMapa.put("totalDescuento", totalDescuento);
		miMapa.put("totalAhorrado", totalAhorrado);
		miMapa.put("tabla", tabla.verIngredientes());
		miMapa.put("cantProductosAgregados", tabla.verIngredientes().size());
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(miMapa);
		miVista.setViewName("carrito");
		return miVista;
	}

	@RequestMapping("/agregarDescuentos")
	public ModelAndView agregarDescuento() {
		return new ModelAndView("agregarDescuentos", "command", new Descuento());
	}

	@RequestMapping(value = "/insertarDescuento", method = RequestMethod.POST)
	public ModelAndView insertarDescuento(
			@ModelAttribute("command") Descuento descuento, ModelMap modelo) {
		Sanguchetto tabla = Sanguchetto.getInstance();
		tabla.aplicarDescuento(descuento);
		Double total = new Double(0);
		Double totalDescuento = new Double(0);
		Double totalAhorrado = new Double(0);
		total = tabla.totalSinDescuentos();
		totalDescuento = tabla.total();
		totalAhorrado = tabla.totalAhorros();
		modelo.put("total", total);
		modelo.put("totalDescuento", totalDescuento);
		modelo.put("totalAhorrado", totalAhorrado);
		modelo.put("tabla", tabla.verIngredientes());
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(modelo);
		miVista.setViewName("carrito");
		return miVista;
	}

	@RequestMapping("/confirmarCarrito")
	public ModelAndView confirmarCarrito() {
		ModelMap modelo = new ModelMap();
		Sanguchetto tabla = Sanguchetto.getInstance();
		Double total = new Double(0);
		total = tabla.total();
		modelo.put("total", total);
		modelo.put("tabla", tabla.verIngredientes());
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(modelo);
		miVista.setViewName("confirmarCarrito");
		return miVista;

	}

	@RequestMapping("/confirmarCompra")
	public ModelAndView confirmarCompra() {
		ModelMap modelo = new ModelMap();
		Sanguchetto tabla = Sanguchetto.getInstance();
		tabla.vaciar();	
		modelo.put("cantProductosAgregados", tabla.verIngredientes().size());
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(modelo);
		miVista.setViewName("compraFinalizada");
		return miVista;

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
