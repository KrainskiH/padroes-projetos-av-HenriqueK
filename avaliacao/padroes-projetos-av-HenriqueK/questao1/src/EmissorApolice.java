public abstract class EmissorApolice {

    protected abstract Apolice criarApolice();


    public final void emitir() {
        Apolice apolice = criarApolice();
        double premio = apolice.calcularPremioMensal();
        imprimirResumo(apolice, premio);
    }


    private void imprimirResumo(Apolice apolice, double premio) {
        System.out.println("-RESUMO DA APOLICE -");
        System.out.println("Linha de produto: " + apolice.getLinhaProduto());
        System.out.println("Segurado: " + apolice.getSegurado());
        System.out.printf("Premio mensal: R$ %.2f%n", premio);
        System.out.println("Documentos: " + apolice.getDocumentosExigidos());
    }
}
