public class Main {
    public static void main(String[] args) {
        System.out.println("PEDDO- BRASIL");
        Checkout pedidoBrasil = new Checkout(new FabricaBrasil());
        pedidoBrasil.finalizarPedido(1000.00);

        System.out.println("PEDIDO- ALEMANHA");
        Checkout pedidoAlemanha = new Checkout(new FabricaAlemanha());
        pedidoAlemanha.finalizarPedido(1000.00);
    }
}