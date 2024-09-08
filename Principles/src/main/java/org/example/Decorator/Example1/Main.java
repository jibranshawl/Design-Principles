package org.example.Decorator.Example1;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new MushRoom(new ExtraCheese(new Margerita()));
        System.out.println(pizza.cost());
    }
}
