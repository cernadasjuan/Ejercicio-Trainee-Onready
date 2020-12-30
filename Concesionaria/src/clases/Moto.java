package clases;

import java.text.DecimalFormat;

public class Moto extends Vehiculo{

private int cantidadCC;


public Moto(String marca, String modelo, double precio,int cantidadCC) {
	super(marca, modelo, precio);
	this.cantidadCC = cantidadCC;
}


@Override
public String toString() {
	DecimalFormat formatea = new DecimalFormat("###,###.00");
	return super.toString() + "Cilindrada: " + cantidadCC + " // "+ "Precio: $" + formatea.format(super.getPrecio());
}

}
