package clases;



public class Vehiculo {
	private String marca;
	private String modelo;
	private double precio;

	
	
	public Vehiculo(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}



	public String getMarca() {
		return marca;
	}



	public String getModelo() {
		return modelo;
	}



	public double getPrecio() {
		return precio;
	}



	@Override
	public String toString() {
		//Marca: Peugeot // Modelo: 206 // 

		
		return "Marca: " + marca + " // Modelo: " + modelo + " // ";
	}



	

	
}
