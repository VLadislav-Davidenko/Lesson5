package com.company.bank;
public class Bank {

    public static void main(String[] args) {

        Account acc1 = new Account(2945.34d,"444165356783245");
        Account acc2 = new Account(143.63d,"7894768949045");

        acc1.SendMoney(acc2, 1000);
        System.out.println(acc1.sum);
        System.out.println(acc2.sum);

    }


}
