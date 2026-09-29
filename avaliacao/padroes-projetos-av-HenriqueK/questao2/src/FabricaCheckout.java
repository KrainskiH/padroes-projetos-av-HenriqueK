public interface FabricaCheckout {
    DocumentoFiscal criarDocumentoFiscal();
    ProcessadorPagamento criarPagamento();
    EtiquetaEnvio criarEtiqueta();
}
