package ObjectOrientation.Exercises.Revision.Orders;

public class Main {
    public static void main(String[] args) {
        Product produto1 = new Electronic(1, "Smartphone", 1.000);
        Product produto2 = new Clothing(2, "Camisa", 100.00);

        PaymentCard pagamentoCartao = new PaymentCard();
        PaymentPix pagamentoPix = new PaymentPix();

        System.out.println("Produto: " + produto1.name);
        System.out.println("Preço com desconto: " + produto1.calculateDiscount());
        pagamentoCartao.processPayment();

        System.out.println();

        System.out.println("Produto: " + produto2.name);
        System.out.println("Preço com desconto: " + produto2.calculateDiscount());
        pagamentoPix.processPayment();
    }
}
