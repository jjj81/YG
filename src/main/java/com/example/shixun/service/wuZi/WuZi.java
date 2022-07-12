package com.example.shixun.service.wuZi;

import java.util.Scanner;

public class WuZi {
    static int[][] qiPan= new int[15][15];

    static  void printQiPan(){
        for (int i = 0; i <15 ; i++) {
            for (int j = 0; j < 15; j++) {
                if (qiPan[i][j] == 0) {
                    System.out.print("  *  ");
                }
                if(qiPan[i][j]==1) System.out.print("  W  ");

                if(qiPan[i][j]==2) System.out.print("  R  ");
                if(j==14) System.out.println("\n");
            }
        }
    }
    static void input(){
        Scanner in =new Scanner(System.in);
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        qiPan[a][b]=1;
    }
    static void shuYin(){
        for (int i = 0; i <15 ; i++) {
            for (int j = 0; j < 15; j++) {
                if(j<=10){
                    if(qiPan[i][j]==1&&qiPan[i][j+1]==1&&qiPan[i][i+2]==1&&qiPan[i][j+3]==1&&qiPan[i][j+4]==1) System.out.println("YOU win!!!!");
                    if(qiPan[i][j]==2&&qiPan[i][j+1]==2&&qiPan[i][i+2]==2&&qiPan[i][j+3]==2&&qiPan[i][j+4]==2) System.out.println("rob win!!!!");

                }
                if(i<=10){
                    if(qiPan[i][j]==1&&qiPan[i+1][j]==1&&qiPan[i+2][j]==1&&qiPan[i+3][j]==1&&qiPan[i+4][j]==1)
                        System.out.println("you win");
                    if(qiPan[i][j]==2&&qiPan[i+1][j]==2&&qiPan[i+2][j]==2&&qiPan[i+3][j]==2&&qiPan[i+4][j]==2)
                        System.out.println("rob win");

                }
                if(j<=10&&i<=10){

                    if(qiPan[i][j]==1&&qiPan[i+1][j+1]==1&&qiPan[i+2][j+2]==1&&qiPan[i+3][j+3]==1&&qiPan[i+4][j+4]==1)
                        System.out.println("you win");
                    if(qiPan[i][j]==2&&qiPan[i+1][j+1]==2&&qiPan[i+2][j+2]==2&&qiPan[i+3][j+3]==2&&qiPan[i+4][j+4]==2)
                        System.out.println("rob win");


                }
                if(i<=10&&j>=5)
                if(qiPan[i][j]==1&&qiPan[i-1][j-1]==1&&qiPan[i-2][j-2]==1&&qiPan[i-3][j-3]==1&&qiPan[i-4][j-4]==1)
                    System.out.println("you win");
                if(qiPan[i][j]==2&&qiPan[i-1][j-1]==2&&qiPan[i-2][j-2]==2&&qiPan[i-3][j-3]==2&&qiPan[i-4][j-4]==2)
                    System.out.println("rob win");


            }

        }


    }
    static void input2(){
        Scanner in =new Scanner(System.in);
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        qiPan[a][b]=2;
    }
    public static void main(String[] args) {

        while(true){
            input();
            printQiPan();
            input2();
            printQiPan();
            shuYin();

        }

    }
}
