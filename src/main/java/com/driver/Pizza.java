package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePrice;
    private int cheese;
    private int toppings;
    private int bag;
    private boolean cheeseAdd=false;
    private boolean toppingsAdd=false;
    private boolean bagAdd=false;
    private boolean billGenerated=false;

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
        if(!cheeseAdd) {
            cheese+=80;
            price+=80;
            cheeseAdd=true;

        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingsAdd){
            if(isVeg){
                toppings+=70;
                price+=70;

            }else{
                toppings+=120;
                price+=120;
            }
            toppingsAdd=true;

        }


    }

    public void addTakeaway(){
        // your code goes here
        if(!bagAdd){
            bag+=20;
            price+=20;
            bagAdd=true;
        }


    }

    public String getBill(){
        // your code goes here
        if(!billGenerated){
            bill="Base Price Of The Pizza: "+ basePrice + "\n";
            if(cheese>0){
                bill+="Extra Cheese Added: "+ cheese + "\n";
            }
            if(toppings>0){
                bill+="Extra Toppings Added: "+ toppings + "\n";
            }
            if(bag>0){
                bill+= "Paperbag Added: "+ bag + "\n";
            }
            bill+="Total Price: "+ price + "\n";

            billGenerated=true;

        }

        return this.bill;
    }
}
