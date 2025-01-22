package ObjectOrientation.Exercises.Revision.Banking;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("12177-9", "Henrique Eduardo Silva Azevedo", 2000.0);

        try {
          
            System.out.println("Saldo atual: R$" + account.getCredit());

            account.deposit(500.0);
            System.out.println("Saldo atual: R$" + account.getCredit());

            account.withdraw(300.0);
            System.out.println("Saldo atual: R$" + account.getCredit());

            account.withdraw(2000.0);
            
            System.out.println("Saldo atual: R$" + account.getCredit());
        } catch (SaldoInsuficienteException e) {
             System.out.println("Erro: " + e.getMessage());
        } catch (ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
