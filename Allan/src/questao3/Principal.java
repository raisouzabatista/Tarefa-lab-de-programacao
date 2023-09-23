package questao3;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		ContaBancaria cb = new ContaBancaria(); 
		System.out.print("Digite o valor a ser depositado/sacado \n");
		double valor = ler.nextDouble();
		cb.Depositar(valor);
		cb.Sacar(valor);
	}

}
