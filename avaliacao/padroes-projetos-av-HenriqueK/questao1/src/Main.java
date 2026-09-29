public class Main {
    public static void main(String[] args) {
        EmissorApolice[] emissores = {
            new EmissorAuto("Joao Silva", 60000.00),
            new EmissorResidencial("Maria Souza", 300000.00),
            new EmissorVida("Carlos Lima", 200000.00)
        };

        for (EmissorApolice emissor : emissores) {
            emissor.emitir();
        }
    }
}
