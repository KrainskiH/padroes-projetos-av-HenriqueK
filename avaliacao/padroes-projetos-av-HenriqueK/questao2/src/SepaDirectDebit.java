public class SepaDirectDebit implements ProcessadorPagamento {
    @Override
    public String descrever() {
        return "Pagamento via SEPA Direct Debit";
    }
}
