package ObjectOrientation.Exercises.Revision.Orders;

public class PaymentPix implements Payment {
    @Override
    public boolean processPayment() {
        System.out.println("Processando Pagamento com Pix");
        return true;
    }
}