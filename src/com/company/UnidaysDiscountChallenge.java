package com.company;

import java.util.ArrayList;

public class UnidaysDiscountChallenge {

    // ArrayList for this class
    private ArrayList<Character> integerArrayList;

    //constructor for class with ArrayList list on creation
    //ArrayList acts as basket for item storage
    public UnidaysDiscountChallenge() {
        this.integerArrayList = new ArrayList<Character>();
    }

    //method for sending items to basket ArrayList
    public void addItem(char item){
        integerArrayList.add(item);

    }

    public void calculateTotal(){
        //used to count instances of each item in the basket
        int itemA = 0;
        int itemB = 0;
        int itemC = 0;
        int itemD = 0;
        int itemE = 0;

        //for loop to cycle through the basket and search for items
        //when item is found - increment or decrement the total dependent on pricing rules
        //In this case only itemE will decrement
        for (int i = 0; i < integerArrayList.size(); i++){
            if (integerArrayList.get(i) == 'a'){
                itemA++;
            }
            else if (integerArrayList.get(i) == 'b'){
                itemB++;
            }
            else if (integerArrayList.get(i) == 'c'){
                itemC++;
            }
            else if (integerArrayList.get(i) == 'd'){
                itemD++;
            }

            else if (integerArrayList.get(i) == 'e'){
                itemE++;

            }


        }
        // item A has only 1 price and no discount
        int itemAPrice = 8;
        int itemATotal = itemA * itemAPrice;
        if (itemATotal > 0) {
            System.out.println("Total item A:  £" + itemATotal);
        }

        //item B - working out how many pairs and remainders of item B are in the basket
        int itemBPairs = itemB/2;
        int itemBRemainder = itemB % 2;

        // 1 pair of item B costs £20 and a single item B costs £12
        int itemBDiscount = itemBPairs * 20;
        int itemBRemainderPrice = itemBRemainder * 12;

        int itemBTotal = itemBDiscount + itemBRemainderPrice;
        if (itemBTotal > 0) {
            System.out.println("Total item B:  £" + itemBTotal);
        }

        //item C - working out how many triplets and remainders of item C are in the basket
        int itemCTriplets = itemC/3;
        int itemCRemainder = itemC % 3;

        // 1 triplet of item C costs £10 and a single item C costs £4
        int itemCDiscount = itemCTriplets * 10;
        int itemCRemainderPrice = itemCRemainder * 4;

        int itemCTotal = itemCDiscount + itemCRemainderPrice;
        if (itemCTotal > 0) {
            System.out.println("Total item C:  £" + itemCTotal);
        }

        //item D - Buy one get one free
        int itemDPrice = 7;
        int pairs = itemD /2;
        int remainder = itemD%2;
        int itemDDiscount = pairs * itemDPrice;
        int remainderDPrice = remainder * itemDPrice;
        int itemDTotal = (itemDDiscount + remainderDPrice);
        if (itemDTotal > 0) {
            System.out.println("Total item D:  £" + itemDTotal);
        }

        //item E - Get 3 for the price of 2
        int itemEPrice = 5;
        int itemETriplets = itemE/3;
        int itemERemainder = itemE%3;
        int itemEDiscount = itemETriplets * (itemEPrice*2);
        int remainderEPrice = itemERemainder * itemEPrice;
        int itemETotal = itemEDiscount + remainderEPrice;
        if (itemETotal > 0){
            System.out.println("Total item E:  £" + itemETotal);
        }

        //find the total of all the items
        //define a variable that includes the shipping fee in instances where the total
        //is less than £50
        int itemTotal = itemATotal + itemBTotal + itemCTotal + itemDTotal + itemETotal;
        int shippingFee = 7;
        int orderTotal = itemTotal + shippingFee;
        if (itemTotal == 0){
            System.out.println("\n=====================" +
                    "\nNo items in basket!" +
                    "\n=====================");
        }
        else if (itemTotal >0 && itemTotal < 50){
            System.out.println("=====================\n" +
                    "item Total: £" + itemTotal + "" +
                    "\nDelivery Charge: £" + shippingFee +
                    "\nBasket total: £" + orderTotal +
                    "\n=====================");
        }
        else {
            System.out.println("=====================\n" +
                    "Basket total: £" + itemTotal +
                    "\nFree delivery - order over £50"+
                    "\n=====================");
        }
    }










}
