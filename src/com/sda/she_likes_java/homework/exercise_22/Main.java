package com.sda.she_likes_java.homework.exercise_22;

public class Main {

    public static void main(String[] args) {
        System.out.println("Let's buy something for barbecue");

        ShoppingCart shoppingCart = new ShoppingCart();
        Item beer = new Item("beer", 10);
        Item sausages = new Item("sausages", 5.5);
        Item meat = new Item("meat", 17.5);

        shoppingCart.addProductToBasket(beer);
        shoppingCart.addProductToBasket(beer);
        shoppingCart.addProductToBasket(beer);
        shoppingCart.addProductToBasket(beer);
        shoppingCart.addProductToBasket(beer);
        shoppingCart.addProductToBasket(sausages);
        shoppingCart.addProductToBasket(meat);

        System.out.println("Show me what's in the shopping cart");
        shoppingCart.displayProducts();

        System.out.println("The total price of the basket of products is: " + shoppingCart.calculateTotalBasketValue());
    }
}
