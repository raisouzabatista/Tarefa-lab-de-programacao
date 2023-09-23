package bonus;

class Laptop extends RecursoBase {
    private String modelo;

    public Laptop(String modelo) {
        this.modelo = modelo;
    }

    public void alocar() {
        super.alocar();
        System.out.println("Laptop " + modelo + " alocado.");
    }

    public void liberar() {
        super.liberar();
        System.out.println("Laptop " + modelo + " liberado.");
    }
}
