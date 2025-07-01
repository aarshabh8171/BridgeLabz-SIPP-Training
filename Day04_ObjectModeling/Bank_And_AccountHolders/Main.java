package Day04_ObjectModeling.Bank_And_AccountHolders;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("State Bank of India");
        Customer customer = new Customer("Aarshabh", 50000.0);

        bank.openAccount(customer);
        customer.viewBalance();
    }
}
