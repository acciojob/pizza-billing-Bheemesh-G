package com.driver;

public class DeluxePizza extends Pizza {

    private int price;

    private String bill;
    private boolean isVeg;

    int dVegPrice;
    int dNonVegPrice;
    int dextraToppings;



    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        this.dVegPrice = vegPrice+extraCheese+extraToppingsVeg;
        this.dNonVegPrice = nonVegPrice+extraCheese+extraToppingsNonVeg;

    }
    @Override
    public int getPrice() {
        if(isVeg == true)
        {
           price = dVegPrice;
           return price;
        }

        price = dNonVegPrice;
        return price;
    }


    @Override
    public void addExtraCheese(){

        if(isVeg==true)
        {
            price = dVegPrice;
            price = dVegPrice+extraCheese;
        }

        else {
            price = dNonVegPrice;
            price = dNonVegPrice+extraCheese;
        }

    }

    @Override
    public void addExtraToppings(){

        if(isVeg == true)
        {
            price = dVegPrice;
            price = dVegPrice+extraToppingsVeg;
        }

        else {

            price = dNonVegPrice;

            price = dNonVegPrice+extraToppingsNonVeg;
        }

    }

    @Override
    public void addTakeaway(){

        price = price+paperBagPrice;

    }

    @Override
    public String getBill(){


        bill = String.valueOf(price);


        return bill;
    }

}
