package clases;

import java.text.DecimalFormat;

public class Auto extends Vehiculo{


	private int cantidadPuertas;

	public Auto(String marca, String modelo, double precio,int cantidadPuertas ) {
		super(marca, modelo, precio);
		this.cantidadPuertas = cantidadPuertas;
	}

	@Override
	public String toString() {
	
		DecimalFormat formatea = new DecimalFormat("###,###.00");
		return super.toString() + "Puertas: " + cantidadPuertas + " // "+ "Precio: $" + formatea.format(super.getPrecio());
	}

}
