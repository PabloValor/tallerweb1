package tallerweb.sangucheto.modelo;

import java.util.LinkedList;
import java.util.List;

import tallerweb.sangucheto.modelo.Descuento;
import tallerweb.sangucheto.modelo.Ingrediente;
import tallerweb.sangucheto.modelo.Stock;

public class Sanguchetto {

	private static Sanguchetto instance = new Sanguchetto();
	private List<Ingrediente> ingredientes = new LinkedList<Ingrediente>();
	private List<Descuento> descuentos = new LinkedList<Descuento>();
	
	private Sanguchetto(){}
	
	public static Sanguchetto getInstance(){
		return instance;
	}
	
	/**
	 * Elimina todos los ingredientes del sanguchetto.<br>
	 */
	
	public void vaciar() {
        ingredientes.clear();
        descuentos.clear();
    }


    public void agregarIngrediente(Ingrediente ingrediente) {
        Stock stock= Stock.getInstance();
        if(stock.obtenerStockDisponible(ingrediente)>0){
        	ingredientes.add(ingrediente);        	
        }
    }
	

	public List<Ingrediente> verIngredientes(){
		return ingredientes;
	}
	

    public List<Ingrediente> verCondimentos(){
        // Implementar
        return null;
    }
	

	public Double getPrecio(){
		// Implementar
		return null;
	}
	
	public void aplicarDescuento(Descuento descuento) {
    	descuentos.add(descuento);
    }
	
    public Double total() {
        Double total=new Double(0);
        for (Ingrediente aux : ingredientes){
        	total=total + aux.getPrecio();
        }
        for (Descuento aux : descuentos){
        	if(aux.getMonto()!=null){
            	total=total - aux.getMonto();        		
        	}
        }
        for (Descuento aux : descuentos){
        	if(aux.getPorcentaje()!=null){
        		total= total - ((aux.getPorcentaje() * total)/100);        		
        	}
        }
        return total;
    }


    public Double totalSinDescuentos() {
        Double total=new Double(0);
        for (Ingrediente aux : ingredientes){
        	total= total + aux.getPrecio();
        }
        return total;
    }


    public Double totalAhorros() {
    	Double total=new Double(0);
    	Double descuentoTotal=new Double(0);
        for (Ingrediente aux : ingredientes){
        	total= total + aux.getPrecio();
        }
        for (Descuento aux : descuentos){
        	if(aux.getMonto()!=null){
        		total=total - aux.getMonto();
        		descuentoTotal= descuentoTotal + aux.getMonto();
        	}
        }
        for (Descuento aux : descuentos){
        	if(aux.getPorcentaje()!=null){
        		descuentoTotal=descuentoTotal + ((aux.getPorcentaje() * total)/100);
        		total= total - ((aux.getPorcentaje() * total)/100);
        	}
        }
        return descuentoTotal;
    }
}
