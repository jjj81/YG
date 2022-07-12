package com.example.shixun.service;

import java.util.Scanner;

public class Yunshu {
    public static void main(String[] args) {
        double end_price = 1;
        double gongJin;
        int diQu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入地区\n");
        diQu=scanner.nextInt();

        System.out.println("输入重量");
        gongJin=scanner.nextDouble();
        switch (diQu){
            case 0:
                end_price=10+(int)gongJin*3;
                if((gongJin)%1==0) end_price=end_price-3;
                break;
            case 1:
                end_price=10+(int)gongJin*4;
                if((gongJin)%1==0) end_price=end_price-4;
                break;
            case 2:
                end_price=16+(int)gongJin*5;
                break;
            case 3:
                end_price=16+(int)gongJin*6.5;
                break;
            case 4:
                end_price=16+(int)gongJin*10;

        }
        System.out.println("endPrice");
        System.out.print(end_price);

    }
}
