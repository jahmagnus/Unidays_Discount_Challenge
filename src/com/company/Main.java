package com.company;

import java.util.Scanner;

public class Main {
        private static UnidaysDiscountChallenge discountChallenge = new UnidaysDiscountChallenge();
        private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        int choice = 0;
        boolean quit = false;

        while(!quit){  //select a choice with an integer
            System.out.println("Please select choice\n" +
                    "0 - quit\n" +
                    "1 - add item to basket\n" +
                    "2 - calculate total");

            choice = sc.nextInt();
            sc.nextLine();

            //based on the choice the switch statement will run one of the methods (or quit in case 0)
            switch (choice){
                case 0: quit = true;
                    System.out.println("==Closing program==");
                    break;

                case 1: addItemToBasket();
                    break;

                case 2: calculateTotal();
                    break;
            }
        }
    }

    public static void addItemToBasket(){
        //the items will correspond with a character which is sent to an arraylist
        char itemA = 'a';
        char itemB = 'b';
        char itemC = 'c';
        char itemD = 'd';
        char itemE = 'e';

        //prices and discount information for the user
        System.out.println("Please make selection");
        System.out.println("1. item A - £7\n" +
                "2. item B - £12 or 2 for £20\n" +
                "3. item C - £4 or 3 for £10\n" +
                "4. item D - £7 (Buy One Get One Free)\n" +
                "5. item E - £5 (3 for the price of 2)\n" +
        "==================================\n");

        //switch statement for sending different items to basket depending on the integer choice made by user
        int selection = sc.nextInt();
        switch (selection){

            case 1: discountChallenge.addItem(itemA);
                break;
            case 2: discountChallenge.addItem(itemB);
                break;
            case 3: discountChallenge.addItem(itemC);
                break;
            case 4: discountChallenge.addItem(itemD);
                break;
            case 5: discountChallenge.addItem(itemE);
                break;
        }
    }

    public static void calculateTotal(){
        discountChallenge.calculateTotal();
    }
}
