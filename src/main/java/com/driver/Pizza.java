package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    int vegPrice;
    int nonVegPrice;
    int extraCheese;
    int extraToppingsVeg;
    int extraToppingsNonVeg;

    int paperBagPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.vegPrice = 300;
        this.nonVegPrice = 400;
        this.extraCheese = 80;
        this.extraToppingsVeg = 70;
        this.extraToppingsNonVeg = 120;
        this.paperBagPrice = 20;


    }

    public int getPrice(){

        if(isVeg == true)
        {
            price = vegPrice;
        }
        else{
            price = nonVegPrice;
        }

        return price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(isVeg)
        {

            price = vegPrice+extraCheese;
        }
        else {
           // price = nonVegPrice;

            price = nonVegPrice+extraCheese;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg==true)
        {
          //  price = vegPrice;
            price = price+extraToppingsVeg;
        }
        else {
           // price = nonVegPrice;

            price = price + extraToppingsNonVeg;
        }
    }

    public void addTakeaway(){
        // your code goes here
        price = price + paperBagPrice;
    }

    public String getBill(){
        // your code goes here

        bill = String.valueOf(price);

       // return "Base Price Of The Pizza: "+vegPrice+"\nExtra Cheese Added: "+extraCheese+"\nExtra Toppings Added: "+extraToppingsVeg+"\nPaperbag Added: "+paperBagPrice+"\nTotal Price: "+bill;

        return this.bill;
    }
}
