package bonus;

import java.util.List;

class Empresa {
	    private List<Recurso> recursosDisponiveis;

	    public Empresa(List<Recurso> recursosDisponiveis) {
	        this.recursosDisponiveis = recursosDisponiveis;
	    }

	    public void alocarRecurso(Recurso recurso) {
	        if (recursosDisponiveis.contains(recurso)) {
	            GerenciadorDeRecurso gerenciador = new GerenciadorDeRecurso();
	            gerenciador.AlocarRecurso(recurso);
	        } else {
	            System.out.println("Recurso não está disponível na empresa.");
	        }
	    }

	    public void liberarRecurso(Recurso recurso) {
	        if (recursosDisponiveis.contains(recurso)) {
	            recurso.liberar();
	        } else {
	            System.out.println("Recurso não está disponível na empresa.");
	        }
	    }
	}

