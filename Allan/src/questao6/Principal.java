package questao6;
import java.util.Scanner; 

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in); 
		
	Circulo c = new Circulo();
	c.setRaio(2);
	double resultado = c.CalcularArea();
	System.out.print(resultado);
		
	}

}
