public class FabricaAlemanha implements FabricaCheckout {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new VatInvoice();
    }

    @Override
    public ProcessadorPagamento criarPagamento() {
        return new SepaDirectDebit();
    }

    @Override
    public EtiquetaEnvio criarEtiqueta() {
        return new EtiquetaDeutschePost();
    }
}
