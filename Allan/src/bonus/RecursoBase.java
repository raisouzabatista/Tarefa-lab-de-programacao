package bonus;

public abstract class RecursoBase implements Recurso {
	protected boolean alocado = false;
	
public void alocar() {
	if(!alocado) {
		System.out.println("Recurso alocado com sucesso");
		alocado = true; 
	} else {
		System.out.println("Recurso já alocado");
	}
}

public void liberar() {
	if(alocado == true) {
		System.out.println("Recurso liberado com sucesso");
		alocado = false; 
	} else {
		System.out.println("Recurso já liberado");
	}
}
}
