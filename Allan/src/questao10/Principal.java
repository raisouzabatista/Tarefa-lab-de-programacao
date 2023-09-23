package questao10;
import java.util.Scanner; 
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler = new Scanner(System.in); 
Circulo c = new Circulo();  
Retangulo r = new Retangulo();

System.out.println("Digite o raio do circulo");
double raio = ler.nextDouble(); 
System.out.println("A area do circulo e igual a: "+ c.Area(raio));
System.out.println("O perimetro do circulo e igual a: "+ c.Perimetro(raio));
System.out.println("Digite a altura do retangulo");
double altura = ler.nextDouble(); 
System.out.println("Digite o comprimento do retangulo");
double comprimento = ler.nextDouble();
System.out.println("A area do retangulo e igual a: "+ r.Area(altura, comprimento));
System.out.println("O perimetro do retangulo e igual a: "+ r.Perimetro(altura, comprimento));

	}

}
