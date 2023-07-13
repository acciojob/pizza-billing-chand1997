package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePrice;
    private int cheese;
    private int toppings;
    private int bag;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            basePrice+=300;
            price+=300;

        }else{
            basePrice+=400;
            price+=400;
        }


    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        cheese+=80;
        price+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            toppings+=70;
            price+=70;

        }else{
            toppings+=120;
            price+=120;
        }

    }

    public void addTakeaway(){
        // your code goes here
        bag+=20;
        price+=20;

    }

    public String getBill(){
        // your code goes here
        bill="Base Price Of The Pizza:"+ basePrice + "\n" +
                "Extra Cheese Added:"+ cheese + "\n" +
        "Extra Toppings Added:"+ toppings + "\n" +
                "Paperbag Added:"+ bag + "\n"+
                "Total Price:"+ price + "\n";
        return this.bill;
    }
}
