package bonus;

public class SalaDeReuniao extends RecursoBase{
    private String numero;

    public SalaDeReuniao(String numero) {
        this.numero = numero;
    }

    public void alocar() {
        super.alocar();
        System.out.println("Sala " + numero + " alocada.");
    }

    public void liberar() {
        super.liberar();
        System.out.println("Sala " + numero + " liberada.");
    }
}
