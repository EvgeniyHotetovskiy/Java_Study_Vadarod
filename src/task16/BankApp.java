package task16;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("1", "1001", "BYN", 500.0);
        Account account2 = new Account("2", "1002", "BYN", 300.0);
        Account account3 = new Account("3", "1003", "BYN", 700.0);
        Account account4 = new Account("4", "1004", "BYN", 1000.0);
        Account account5 = new Account("5", "1005", "BYN", 50.0);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);

        try {
            bank.transferMoney("1001", "1005", 200);
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов.");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода.");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка.");
        }

        try {
            bank.transferMoney("1001", "1004", 400);
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов.");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода.");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка.");
        }

        try {
            bank.transferMoney("1006", "1004", 400);
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов.");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода.");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка.");
        }
    }
}
