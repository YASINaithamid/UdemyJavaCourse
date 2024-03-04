package org.example.business;

import org.example.model.BankAccount;

import java.util.List;

public interface BankAccountService {
    ///its not necessary to declare a methode as public or abstract becse all methode in an interface are abstract and public
    BankAccount addBankAccount(BankAccount account);
       List<BankAccount> getAllAccounts();
      BankAccount getAccountById(String id) throws Exception;
      void  addRandomData(int size);
      void credit(String accountId, double amount);
      void debit(String accountId, double amount);

      void transfer(String acountSource, String accountDestination, double abount);

}
