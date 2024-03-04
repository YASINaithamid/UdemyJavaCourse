package org.example;

import org.example.model.BankAccount;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        System.out.println(str1 == str2);  // true (references the same object in string pool)
        System.out.println(str1 == str3);  // false (references different objects)
        System.out.println(str1.equals(str3) );//true

        BankAccount account1;

         account1=new BankAccount();

         //account1.setAccountId("78788797");
         account1.setBalance(125.1);
         account1.setCurrency("maaaaaaaaaad");
        // account1.setStatus("Createdddd");
        BankAccount account2;

        account2=new BankAccount();

        //account1.setAccountId("78788797");
        account2.setBalance(125.1);
        account2.setCurrency("maaaaaaaaaad");
        // account1.setStatus("Createdddd");
        //System.out.println(account1);
        System.out.println("====================account1 2 ");
        account2.setAccountId(account1.getAccountId());
        System.out.println(account1==account2);
        System.out.println(account1.equals(account2));

        printAccount(account1);
        printAccount(account2);

        String num1 = new String("yasin");
        String num2 = new String("yasin");

        System.out.println("======================================================");
        System.out.println(num1==num2);
        System.out.println(num1.equals(num2));  // true (same value)
        String num3 = "yasin";
        String num4 = "yasin";
        System.out.println("======================================================");
        System.out.println(num3==num4);
        System.out.println(num3.equals(num4));  // true (same value)


    }
    public static void printAccount(BankAccount account){
        System.out.println("**************************************************! ");
        System.out.println("accountId! "+ account.getAccountId());
        System.out.println("status! "+ account.getStatus());
        System.out.println("account1.balance  "+  account.getBalance());
        System.out.println("account1.currency "+ account.getCurrency());
        System.out.println("HashCode "+ account.hashCode());
    }
}