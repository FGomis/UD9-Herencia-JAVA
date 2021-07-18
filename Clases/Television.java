package Clases;

public class Television extends Electrodomestico{
//	Constantes
	private final int RESOLUCION = 20;
	
	private final boolean TDT = false;
	
//	Atributos
	protected int resolucion;
	
	protected boolean tdt;

	public Television() {
		this.resolucion = RESOLUCION;
		this.tdt = TDT;
	}
	
//	Constructor al que pasamos los atributos de precio y peso
	public Television(float precioBase, float peso) {
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
		this.peso = peso;
		this.resolucion = RESOLUCION;
		this.tdt = TDT;
	}
	
//	Constructor al que pasamos los atributos de precio y peso
	public Television(float precioBase, String color, char consumoEnergetico, float peso, int resolucion, boolean tdt) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
	
	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

	public void setTdt(boolean tdt) {
		this.tdt = tdt;
	}

	
	
	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", tdt=" + tdt + ", precioBase=" + precioBase + ", color="
				+ color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + "]";
	}

	@Override
	public float precioFinal() {
		float precioFinal = super.precioFinal();
		if(tdt) {
			precioFinal += 50;
		}
		if(resolucion >= 40) {
			precioFinal = precioFinal + (precioFinal*0.3f);
		}
		return precioFinal;
	}
}
