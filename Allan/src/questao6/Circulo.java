package questao6;

public class Circulo {

	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	} 
	
	public double CalcularArea(){
		double resultado = (2 * 3.14 )* (this.raio *this.raio);
		return resultado;
	}
	
}
