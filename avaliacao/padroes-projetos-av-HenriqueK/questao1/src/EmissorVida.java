public class EmissorVida extends EmissorApolice {
    private String segurado;
    private double capitalSegurado;

    public EmissorVida(String segurado, double capitalSegurado) {
        this.segurado = segurado;
        this.capitalSegurado = capitalSegurado;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceVida(segurado, capitalSegurado);
    }
}