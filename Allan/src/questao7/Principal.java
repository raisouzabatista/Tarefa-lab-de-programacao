package questao7;
import java.util.Scanner; 

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in); 
	
		Banco b = new Banco(); 
		System.out.println("Digite o saldo");
		double saldo = ler.nextDouble(); 
		double juros = b.CalcularTaxaJuros(saldo);
		System.out.println(juros);
	}

}
