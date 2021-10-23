package com.company.bank;

public class Account {
    double sum;
    String number;

    public Account(double sum, String number) {
        this.sum = sum;
        this.number = number;
    }

    public double SendMoney(Account reciver, double money){
        if (money < sum){
            reciver.sum += money;
            sum -= money;
            return sum;
        } else{
            System.out.println("Error");
        }


        return sum;
    }


}
