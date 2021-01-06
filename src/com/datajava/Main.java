package com.datajava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){



        Scanner userInput = new Scanner(System.in);
        boolean y=true;

        int pos1, cust1, pos2, cust2, pos3, cust3, sales ,cust, average;
        while (y) {
            print("\n===================================\n");
            println("Menghitung : ");
            println("[1] Sales per sift");
            println("[2] Total Cash Drop");
            println("[3] Total Sales");
            print("===================================\n");

            print("Masukan nomer : ");

            int x = userInput.nextInt();
            println(" ");

            switch (x){

                case 1:
                    print("\n===================================\n");
                    println("Total Sales Per Sift : \n");

                    print("Sales POS 1 =  ");
                    pos1 = userInput.nextInt();
                    print("Cust POS 1  =  ");
                    cust1 = userInput.nextInt();
                    println(" ");
                    print("Sales POS 2 =  ");
                    pos2 = userInput.nextInt();
                    print("Cust POS 2  =  ");
                    cust2 = userInput.nextInt();
                    println(" ");
                    print("Sales POS 3 =  ");
                    pos3 = userInput.nextInt();
                    print("Cust POS 3  =  ");
                    cust3 = userInput.nextInt();
                    println(" ");
                    sales = pos1 + pos2 + pos3;
                    cust = cust1 + cust2 + cust3;
                    average = sales / cust;
                    println("--------------------------");
                    System.out.printf("Sales : Rp. %,d\n",sales);
                    println("Cust : " + cust);
                    System.out.printf("Average : Rp. %,d",average);
                    println("\n--------------------------");
                    print("===================================\n");
                    break;

                case 2:
                    print("\n===================================\n");
                    int cash1,cash2,cash3;
                    println("Total Cash Drop : \n");
                    print("Cash POS 1 = ");
                    cash1=userInput.nextInt();
                    print("Cash POS 2 = ");
                    cash2=userInput.nextInt();
                    print("Cash POS 3 = ");
                    cash3=userInput.nextInt();
                    println("\n--------------------------");
                    int totalCash=cash1+cash2+cash3;
                    System.out.printf("Total Cash Drop : Rp. %,d",totalCash);
                    println("\n--------------------------");
                    print("===================================\n");
                    break;

                case 3:

                    int total, cust4, average4;
                    print("\n===================================\n");
                    print("Total Sales     = Rp. ");
                    total = userInput.nextInt();
                    print("Total Customer =  ");
                    cust4 = userInput.nextInt();
                    average4 = total/cust4;

                    println(" ");
                    println("--------------------------");
                    System.out.printf("Total : Rp. %,d\n",total);
                    println("Cust : " + cust4);
                    System.out.printf("Average : Rp. %,d",average4);
                    println("\n--------------------------");
                    print("===================================\n");
                    break;

                default :
                    println("Maaf nomer yang anda masukkan tidak tersedia, silakan masukkan nomer yang tertera di atas.\n");
                    break;
            }
            print("Ingin Melanjutkan [yes/no] : ");

            boolean z=true ;
            while(z){
                String pilihan=userInput.next();
                switch (pilihan){
                    case "yes":
                        z=false ;
                        break ;

                    case "no":
                        z=false;
                        y=false ;
                        break;

                    default :
                        System.err.println("Wrong Input.");
                        break;


                }
            }
        }
        println("\nThank You :) ");
    }
    private static void print(String dataInput){

        System.out.print(dataInput);
    }
    private static void println(String dataInput2){
        System.out.println(dataInput2);
    }
}

