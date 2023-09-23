package questao3;

public class ContaBancaria {
	
	private double saldo;  
	
	public void Sacar(double dinheiro) {
		if(dinheiro <= saldo) {
			this.saldo += dinheiro; 
			System.out.print("Dinheiro sacado com sucesso \n");
		} else {
			System.out.print("Não a saldo disponivel \n");
		}
		
	}
    public void Depositar(double dinheiro) {
		if(dinheiro > 0) {
			this.saldo += dinheiro; 
			System.out.print("Dinheiro depositado com sucesso \n");
		} else {
			System.out.print("Não a como depositar valores negativos \n");
		}
	}

}
