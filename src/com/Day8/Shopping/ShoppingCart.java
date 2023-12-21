package com.Day8.Shopping;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;


    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    public void addItem(Product product){
        items.add(product);
    }

    public void removeItem(Product product){
        items.remove(product);
    }

    public void displayCart(){
        if(items.isEmpty()){
            System.out.println("Shoping items is empty");
        }else{
            System.out.println("Items in your shopping cart");
            for(Product item:items){
                System.out.println(item.getName()+" "+item.getPrice());
            }
        }
    }

    public double getTotal(){
        double total =0.0;
        for(Product item : items){
            total = total+ item.getPrice(); // total+= item.getPrice();
        }
        return total;
    }

    public void placeOrder(){
        if(items.isEmpty()){
            System.out.println("Shopping items is empty");
        }else{
            double total = getTotal();
            System.out.println("Total amount is :$"+ total);

        }
    }

    public void clearCart(){
        items.clear();
        System.out.println("Your shopping items cleard");
    }

    public static void main(String[] args) {
        Product p = new Product("Shirt",599.99);
        Product p1 = new Product("Pant",899.99);
        Product p2 = new Product("Jeans",999.99);
        ShoppingCart s = new ShoppingCart();
        s.addItem(p);
        s.addItem(p1);
        s.addItem(p2);
        s.displayCart();
        s.placeOrder();
        s.removeItem(p2);
        s.displayCart();


    }
}