public class EmissorAuto extends EmissorApolice {
    private String segurado;
    private double valorVeiculo;

    public EmissorAuto(String segurado, double valorVeiculo) {
        this.segurado = segurado;
        this.valorVeiculo = valorVeiculo;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceAuto(segurado, valorVeiculo);
    }
}
