package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int toppings;

    boolean isExtraCheese;
    boolean isExtraToppings;
    boolean isBilled;
    boolean isAddedBag;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        if(isVeg)
        {
            this.price = 300;
            this.toppings = 70;
            this.bill = "Base Price Of The Pizza: "+this.price+"\n";
        }
        else{
            this.price = 400;
            this.toppings = 120;
            this.bill = "Base Price Of The Pizza: "+this.price+"\n";
        }


    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheese==false)
        {
            isExtraCheese = true;
            price = price + 80;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppings==false)
        {
            isExtraToppings = true;
            price = price+this.toppings;
        }
    }

    public void addTakeaway(){
        // your code goes here

        if(isAddedBag==false)
        {
            isAddedBag = true;

            price +=20;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBill(){
        // your code goes here

        if(isBilled==false)
        {
            isBilled = true;
            if(isExtraCheese)
            {
                bill+="Extra Cheese Added: "+80+"\n";
            }

            if(isExtraToppings)
            {
                bill+="Extra Toppings Added: "+this.toppings+"\n";
            }
            if(isAddedBag)
            {
                bill+="Paperbag Added: "+20+"\n";
            }

            bill+="Total Price: "+this.price;

            return bill;
        }
        return "";
    }
}
