package bonus;

public class Projetor extends RecursoBase {
    private String modelo;

    public Projetor(String modelo) {
        this.modelo = modelo;
    }

    public void alocar() {
        super.alocar();
        System.out.println("Projetor " + modelo + " alocado.");
    }

    public void liberar() {
        super.liberar();
        System.out.println("Projetor " + modelo + " liberado.");
    }
}
