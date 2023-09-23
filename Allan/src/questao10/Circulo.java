package questao10;

public class Circulo extends Shape {
	
	public double Area(double raio) {
		double resultado = 2 * 3.14 * raio *raio; 
		return resultado; 
	}
	public double Perimetro(double raio) {
		double resultado = 2* 3.14 * raio; 
		return resultado; 
	}

}
