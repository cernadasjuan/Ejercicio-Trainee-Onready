package programa;

import clases.Concesionaria;

public class Test {

	public static void main(String[] args) {
		
		Concesionaria c1 = new Concesionaria();
		
		c1.cargarVehiculos();
		
		c1.mostrarVehiculos();
	
		System.out.println("=============================");
		c1.MostrarVehiculoMasCaro();
		c1.mostrarVehiculoMasBarato();
		c1.mostrarVehiculoConteniendoLetra("Y");
		System.out.println("=============================");
		c1.vehiculosDeMayorAMenor();
	}

}
