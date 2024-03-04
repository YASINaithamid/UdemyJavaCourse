package org.example.business;

import org.example.model.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class BankAccountServiceImpl  implements BankAccountService {
    private List<BankAccount> bankAccountList =new ArrayList<>();

    @Override
    public BankAccount addBankAccount(BankAccount account) {
        bankAccountList.add(account);
        return account;

    }

    @Override
    public List<BankAccount> getAllAccounts() {
        return bankAccountList;
    }

    @Override
    public BankAccount getAccountById(String id)  {
        for (BankAccount bankAccount:bankAccountList){
            if(bankAccount.getAccountId().equals(id)){
                return bankAccount;

            }

        }
        throw new RuntimeException("Account not found");

    }

    @Override
    public void addRandomData(int size) {

    }

    @Override
    public void credit(String accountId, double amount) {

    }

    @Override
    public void debit(String accountId, double amount) {

    }

    @Override
    public void transfer(String acountSource, String accountDestination, double abount) {

    }
}
