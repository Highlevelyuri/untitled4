package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = 0D;
        double  sum = 0D ;
        double all = 0D ;

        System.out.println(" Сумма покупки");
        price = scanner.nextDouble();
        if ( price > 500 )
        if ( price <1001)
        {
            System.out.println("Вам предоставляесся скидка: 3%");
            double discout = 0.03;
            sum = discout * price;
            all = price + sum ;
            System.out.println(" Сумма с учетом скидки:" + all );
        }

        else if ( price > 1000) {
            System.out.println("Вам предоставляесся скидка: 5% ");
            double discount2 = 0.05;
            sum = price * discount2;
            all = price + sum;
            System.out.println(" Сумма с учетом скидки:" + all);
        }



    }
}
