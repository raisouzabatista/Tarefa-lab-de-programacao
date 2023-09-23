package questao4;
import java.util.Scanner; 
public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in); 
		
		Triangulo t = new Triangulo();
		System.out.println("Digite a base");
		float base = ler.nextFloat();
		t.setBase(base);
		
		System.out.println("Digite a altura");
		float altura = ler.nextFloat();
		t.setAltura(altura);
		float resultado = t.CalcularArea();
		System.out.println(resultado);




		
		
		
	}

}
