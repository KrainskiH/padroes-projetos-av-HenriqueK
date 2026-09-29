class ApoliceAuto extends Apolice {
    private double valorVeiculo;

    public ApoliceAuto(String segurado, double valorVeiculo) {
        super(segurado);
        this.valorVeiculo = valorVeiculo;
    }

    @Override
    public String getLinhaProduto() {
        return "Auto";
    }

    @Override
    public double calcularPremioMensal() {
        return (valorVeiculo * 0.08) / 12;
    }

    @Override
    public String getDocumentosExigidos() {
        return "CNH e CRLV";
    }
}