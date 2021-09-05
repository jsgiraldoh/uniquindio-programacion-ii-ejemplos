package co.uniquindio.fundamentos.triangulo;

import co.uniquindio.fundamentos.triangulo.model.Triangulo;

/**
 * Es la clase en donde se invoca el main
 * 
 * @author Sonia Jaramillo Valbuena
 * @author Sergio Augusto Cardona
 *
 */

public class Aplicacion {

	/**
	 * Metodo principal
	 * 
	 * @param args Argumentos de la linea de comandos
	 */
	public static void main(String args[]) {
		double base = 5;
		double altura = 4;
		double area = 0;
		Triangulo miTriangulo; // miTriangulo es una referencia a un objeto de tipo Triangulo
		miTriangulo = new Triangulo();
		miTriangulo.setBase(base); // método para fijar el atributo base
		miTriangulo.setAltura(altura); // método para fijar el atributo altura
		area = miTriangulo.calcularArea(); // esto devolvería (15*4)/2=10
		System.out.println("El area es " + area);
	}

}
