package Clases;

public class Lavadora extends Electrodomestico{
//	Constantes
	private final int CARGA = 5;
	
//	Atributos
	protected int carga;

	public Lavadora() {
		this.carga = CARGA;
	}
	
//	Constructor al que pasamos los atributos de precio y peso
	public Lavadora(float precioBase, float peso) {
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
		this.peso = peso;
		this.carga = CARGA;
	}
	
//	Constructor al que pasamos los atributos de precio y peso
	public Lavadora(float precioBase, String color, char consumoEnergetico, float peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}
	
	@Override
	public float precioFinal() {
		float precioFinal = super.precioFinal();
		if(carga >= 30) {
			precioFinal += 50;
		}
		return precioFinal;
	}
	

//	Getters y setters
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

//	Método toString
	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	
}
