package com.driver;

public class DeluxePizza extends Pizza {

    private int price;

    private String bill;
    private boolean isVeg;

    int dVegPrice;
    int dNonVegPrice;
   // int dextraToppings;



    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        this.isVeg = isVeg;
        this.dVegPrice = vegPrice+extraCheese+extraToppingsVeg;
        this.dNonVegPrice = nonVegPrice+extraCheese+extraToppingsNonVeg;

    }
    @Override
    public int getPrice() {
        if(isVeg)
        {
           price = this.dVegPrice;
        }
        else{
            price = this.dNonVegPrice;
            System.out.println(price+"......");
        }
        return price;
    }


    @Override
    public void addExtraCheese(){

        if(isVeg==true)
        {
            price = price+extraCheese;
        }

        else {
            price = price+extraCheese;
        }

    }

    @Override
    public void addExtraToppings(){

        if(isVeg == true)
        {
            price = price+extraToppingsVeg;
        }

        else {

            price = price+extraToppingsNonVeg;
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
