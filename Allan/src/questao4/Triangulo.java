package questao4;

public class Triangulo {

	private float base;
	private float altura; 
	
	public float CalcularArea() {
		
		float resultado = (base * altura)/2;
		
		return resultado;
		
	
		
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
}
