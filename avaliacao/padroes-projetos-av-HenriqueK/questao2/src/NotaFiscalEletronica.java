public class NotaFiscalEletronica implements DocumentoFiscal {
    private static final double ICMS = 0.18;

    @Override
    public String descrever(double valor) {
        return String.format("NF-e com ICMS de 18%% (R$ %.2f)", valor * ICMS);
    }
}
