public class VatInvoice implements DocumentoFiscal {
    private static final double VAT = 0.19;

    @Override
    public String descrever(double valor) {
        return String.format("VAT invoice com imposto de 19%% (R$ %.2f)", valor * VAT);
    }
}
