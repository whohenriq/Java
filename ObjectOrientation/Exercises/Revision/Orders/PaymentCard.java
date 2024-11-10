package ObjectOrientation.Exercises.Revision.Orders;

public class PaymentCard implements Payment {
    @Override
    public boolean processPayment() {
        System.out.println("Processando Pagamento com Cartão");
        return true;
    }
}
