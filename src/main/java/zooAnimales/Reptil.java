package zooAnimales;

import gestion.*;

public class Reptil extends Animal {
	private static int listado = 0;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil () {
		this.listado++;
	}
	public Reptil (String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		this.setNombre(nombre); this.setEdad(edad); this.setHabitat(habitat); this.setGenero(genero); 
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		this.listado++;
	}
	public static int cantidadReptiles() {
		return listado;
	}
	public String movimiento() {
		return "reptar";
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		iguanas++;
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil snake = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		serpientes++;
		return snake;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
}