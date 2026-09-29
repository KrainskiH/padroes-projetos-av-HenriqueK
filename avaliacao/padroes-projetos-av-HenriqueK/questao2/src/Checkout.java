public class Checkout {
    private final FabricaCheckout fabrica;

    
    public Checkout(FabricaCheckout fabrica) {
        this.fabrica = fabrica;
    }

    public void finalizarPedido(double valor) {
        DocumentoFiscal documento = fabrica.criarDocumentoFiscal();
        ProcessadorPagamento pagamento = fabrica.criarPagamento();
        EtiquetaEnvio etiqueta = fabrica.criarEtiqueta();


        System.out.printf("Valor do pedido: R$ %.2f%n", valor);
        System.out.println("Documento fiscal: " + documento.descrever(valor));
        System.out.println("Pagamento: " + pagamento.descrever());
        System.out.println("Etiqueta: " + etiqueta.descrever());
        System.out.println();
    }
}
