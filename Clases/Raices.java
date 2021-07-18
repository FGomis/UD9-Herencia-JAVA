package Clases;

public class Raices {
	
//	Atributos
	protected double a;
	
	protected double b;
	
	protected double c;
	
	protected double discriminante;
	
	protected double raizCuadrada;

//	Constructor principal
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
//	Método para calcular el discriminante
	private void getDiscriminante() {	
//		Controlamos que no haya entrada de ceros en los dos primeros coeficientes
//		No habría ecuación
		if(a==0 && b==0) {
			this.discriminante = -1;
		} else {
			this.discriminante = Math.pow(b,2) - (4 * a * c);
		}
	}
	
//	Comprovamos si el discriminante es cero
	private boolean tieneRaiz() {
		return this.discriminante == 0 ? true : false;
	}
	
//	Comprovamos si el discriminante es mayor que cero
	private boolean tieneRaices() {
		return this.discriminante > 0 ? true : false;
	}
	
//	Obtenemos la solución de la ecuación y la devolvemos en un String
	private String obtenerRaiz() {
		return "Solo tenemos una posible solución: "+getEcuacion("+");
	}
//	Obtenemos las soluciones de las ecuaciones y las devolvemos en un String
	private String obtenerRaices() {
		return "Tenemos dos posibles soluciones: "+getEcuacion("+")+" y "+getEcuacion("-");
	}
	
//	Método para obtener la raíz cuadrada del discriminante
	private void raizCuadrada() {
		this.raizCuadrada = Math.sqrt(discriminante);
	}
	
//	Método para calcular los resultados de la ecuación
	private double getEcuacion(String signo) {
		if(signo.equalsIgnoreCase("+")) {
			return ((-b + this.raizCuadrada) / (2*a));
		} else {
			return ((-b - this.raizCuadrada) / (2*a));
		}
	}
	
//	Método que nos filtra el número de resultados que tiene nuestra ecuación y nos imprime el resultado
	public void calcular() {
//		Obtenemos la raiz cuadrada y el discriminante
		this.getDiscriminante();
		this.raizCuadrada();
		
		if(this.tieneRaices()) {
			System.out.println(obtenerRaices());
		} else if(this.tieneRaiz()) {
			System.out.println(obtenerRaiz());
		} else {
			System.out.println("No hay solución posible.");
		}
	}
}
