package questao9;
import java.util.Scanner; 

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in); 
	
		GerenciadorDeArquivos qda = new GerenciadorDeArquivos(); 
		System.out.println("Digite o nome do arquivo");
		String nomeArq = ler.next();
		qda.lerArquivo(nomeArq);
	}

}
