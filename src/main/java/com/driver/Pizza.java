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
            return price;
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
      /*  System.out.println("Base Price Of The Pizza: "+vegPrice);
        System.out.println("Extra Cheese Added: "+extraCheese);
        System.out.println("Extra Toppings Added: "+extraToppingsVeg);
        System.out.println("Paperbag Added: "+paperBagPrice); */

        bill = String.valueOf(price);

        return "Base Price Of The Pizza: 300\nExtra Cheese Added: 80\nExtra Toppings Added: 20\nPaperbag Added: 20\nTotal Price: "+bill;
    }
}
