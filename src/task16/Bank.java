package task16;

import java.util.HashSet;
import java.util.Set;

public class Bank {
    private Set<Account> accounts = new HashSet<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, double amount) {
        Account accountFrom = findAccount(accountNumberFrom);
        Account accountTo = findAccount(accountNumberTo);

        if (accountFrom == null || accountTo == null) {
            throw new AccountNotFoundException("not.found.account");
        }

        if (accountFrom.getBalance() < amount) {
            throw new NotEnoughMoneyException("not.enough.money");
        }

        accountFrom.setBalance(accountFrom.getBalance() - amount);
        accountTo.setBalance(accountTo.getBalance() + amount);
    }

    private Account findAccount(String accountNumber) {
        return accounts.stream()
                .filter(account -> account.getAccountNumber().equals(accountNumber))
                .findFirst()
                .orElse(null);
    }
}
