public class EmissorResidencial extends EmissorApolice {
    private String segurado;
    private double valorImovel;

    public EmissorResidencial(String segurado, double valorImovel) {
        this.segurado = segurado;
        this.valorImovel = valorImovel;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceResidencial(segurado, valorImovel);
    }
}
