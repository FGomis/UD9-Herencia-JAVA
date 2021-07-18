package Clases;

public class Electrodomestico {
//	Constantes para el constructor por defecto
	protected final float PRECIOBASE = 100;
	
	protected final String COLOR = "blanco";
	
	protected final char CONSUMOENERGETICO = 'F';
	
	protected final float PESO = 5;
	
	
//	Atributos
	protected float precioBase;
	
	protected String color;
	
	protected char consumoEnergetico;
	
	protected float peso;

//	Constructor por defecto
	public Electrodomestico() {
		this.precioBase = PRECIOBASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
		this.peso = PESO;
	}
	
//	Constructor al que pasamos los atributos de precio y peso
	public Electrodomestico(float precioBase, float peso) {
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
		this.peso = peso;
	}
	
//	Constructor al que pasamos todos los atributos
	public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}
	
//	Método para comprobar el color
	private String comprobarColor(String color) {
//		String con todos los colores disponibles
		String[] colores = {"blanco", "negro", "azul", "gris"};
		for (int i = 0; i < colores.length; i++) {
//			Comparamos el input con los colores disponibles en el array, si coinciden devolvemos el input original
			if(color.toLowerCase().equals(colores[i])) {
				return color;
			}
		}
//		En caso de no coincidir ninguno devolvemos el color por defecto
		return "blanco";
	}
	
//	Método para comprobar el consumo energetico
	private char comprobarConsumoEnergetico(char letra) {
//		String con todas las letras disponibles
		char[] letras = {'A', 'B', 'C', 'D', 'E', 'F'};
		for (int i = 0; i < letras.length; i++) {
//			Comparamos el input con las letras disponibles en el array, si coinciden devolvemos el input original
			if(letra==letras[i]) {
				return letra;
			}
		}
//		En caso de no coincidir ninguna devolvemos la letra por defecto
		return 'F';
	}
	
	public float precioFinal(){
		float precioFinal = precioBase;
		switch (consumoEnergetico) {
		case 'A':
			precioFinal += 100;
			break;
		case 'B':
			precioFinal += 80;
			break;
		case 'C':
			precioFinal += 60;
			break;
		case 'D':
			precioFinal += 50;
			break;
		case 'E':
			precioFinal += 30;
			break;
		case 'F':
			precioFinal += 10;
			break;
		}
		
		if(peso <= 19) {
			precioFinal += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioFinal += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioFinal += 80;
		}else if (peso >= 80) {
			precioFinal += 100;
		}
		return precioFinal;
	}
	
	
//	Getters y setters
	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
}
