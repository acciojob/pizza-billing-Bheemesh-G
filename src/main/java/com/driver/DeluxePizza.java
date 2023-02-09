package com.driver;

public class DeluxePizza extends Pizza {

   private boolean isVeg;


    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        this.isVeg = isVeg;
        if(isVeg)
        {
            this.vegPrice = vegPrice+extraCheese+extraToppingsVeg;
        }
        else if(isVeg == false)
        {
            this.nonVegPrice = nonVegPrice+extraCheese+extraToppingsNonVeg;
        }

    }

}
