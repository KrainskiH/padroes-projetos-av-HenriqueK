abstract class Apolice {
    protected String segurado;

    public Apolice(String segurado) {
        this.segurado = segurado;
    }

    public String getSegurado() {
        return segurado;
    }

    public abstract String getLinhaProduto();
    public abstract double calcularPremioMensal();
    public abstract String getDocumentosExigidos();
}