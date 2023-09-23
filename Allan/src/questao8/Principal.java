package questao8;
import java.util.Scanner; 

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in); 
	
		Documento d = new Documento(); 
		Foto f = new Foto();
		d.Imprimir();
		f.Imprimir();
	}

}
