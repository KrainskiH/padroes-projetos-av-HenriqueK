public class FabricaBrasil implements FabricaCheckout {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new NotaFiscalEletronica();
    }

    @Override
    public ProcessadorPagamento criarPagamento() {
        return new PagamentoPix();
    }

    @Override
    public EtiquetaEnvio criarEtiqueta() {
        return new EtiquetaCorreios();
    }
}
