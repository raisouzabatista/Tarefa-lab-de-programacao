package questao7;

public class Banco {

	
	public double CalcularTaxaJuros(double saldo) {
		double resultado; 
		
		if(saldo > 0) {
		resultado = saldo * 0.25; 
		} else {
			resultado = saldo * 0.35; 
		}
		
		return resultado; 
	}
}
