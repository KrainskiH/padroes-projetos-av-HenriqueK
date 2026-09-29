class ApoliceVida extends Apolice {
    private double capitalSegurado;

    public ApoliceVida(String segurado, double capitalSegurado) {
        super(segurado);
        this.capitalSegurado = capitalSegurado;
    }

    @Override
    public String getLinhaProduto() {
        return "Vida";
    }

    @Override
    public double calcularPremioMensal() {
        return (capitalSegurado * 0.03) / 12;
    }

    @Override
    public String getDocumentosExigidos() {
        return "Documento de identidade e CPF";
    }
}
