class ApoliceResidencial extends Apolice {
    private double valorImovel;

    public ApoliceResidencial(String segurado, double valorImovel) {
        super(segurado);
        this.valorImovel = valorImovel;
    }

    @Override
    public String getLinhaProduto() {
        return "Residencial";
    }

    @Override
    public double calcularPremioMensal() {
        return (valorImovel * 0.015) / 12;
    }

    @Override
    public String getDocumentosExigidos() {
        return "Escritura ou contrato de locacao";
    }
}