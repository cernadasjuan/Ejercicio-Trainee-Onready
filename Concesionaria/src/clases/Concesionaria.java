package clases;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Concesionaria {

	private ArrayList <Vehiculo> vehiculos;

	
	public Concesionaria() {

	vehiculos = new ArrayList<>();

	}

	public void mostrarVehiculos(){
		for (Vehiculo v : vehiculos) {
			System.out.println(v);
		}
	}
	
	public void vehiculosDeMayorAMenor(){
		ArrayList <Vehiculo> aux = new ArrayList<>();
		
		while (vehiculos.size()!= 0) {
			Vehiculo v = buscarVehiculoMasCaro();
			vehiculos.remove(buscarVehiculoMasCaro());
			aux.add(v); 
					}
		vehiculos = aux;

		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		for (Vehiculo v : vehiculos) {
			System.out.println(v.getMarca()+" "+v.getModelo());
		}
	}
	
	public void MostrarVehiculoMasCaro(){
		double max= -1;
		Vehiculo vehiculoMax = null;
		for (Vehiculo v : vehiculos) {
			if (v.getPrecio() > max) {
				vehiculoMax= v;
				max= v.getPrecio();
			}
		}
		System.out.println("Vehículo más caro: " + vehiculoMax.getMarca()+ " " +vehiculoMax.getModelo());
		
		
	}
	
	private Vehiculo buscarVehiculoMasCaro(){
		double max= -1;
		Vehiculo vehiculoMax = null;
		for (Vehiculo v : vehiculos) {
			if (v.getPrecio() > max) {
				vehiculoMax= v;
				max= v.getPrecio();
			}
		}
			return vehiculoMax;
	}
	
	public void mostrarVehiculoMasBarato(){
		double min= Double.MAX_VALUE;
		Vehiculo vehiculoMin = null;
		for (Vehiculo v : vehiculos) {
			if (v.getPrecio() < min) {
				vehiculoMin= v;
				min= v.getPrecio();
			}
		}
		System.out.println("Vehículo más Barato: " + vehiculoMin.getMarca()+ " " +vehiculoMin.getModelo());
	}
	
	public void mostrarVehiculoConteniendoLetra(String letra){
		DecimalFormat formatea = new DecimalFormat("###,###.00");
		for (Vehiculo v : vehiculos) {
		String validos = letra;
          for (int i = 0; i < v.getModelo().length(); i++) {
            char caracter = v.getModelo().charAt(i);
            if (validos.indexOf(caracter) != -1) {
            	
                System.out.println("Vehículo que contiene en el modelo la letra '" + letra + "' : " +v.getMarca() + " " + v.getModelo() +" $"+ formatea.format(v.getPrecio()));
            	}
        	}
          }
		}
	
	public void cargarVehiculos() {
	
		Vehiculo v1 = new Auto("Peugeot", "206", 200000, 4);
		Vehiculo v2 = new Moto("Honda", "Titan", 60000, 125);
		Vehiculo v3 = new Auto("Peugeot", "208", 250000, 5);
		Vehiculo v4 = new Moto("Yamaha", "YBR", 80500.50, 160);

		vehiculos.add(v1);
		vehiculos.add(v2);
		vehiculos.add(v3);
		vehiculos.add(v4);
	}
}
