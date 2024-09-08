package org.example.Decorator.Example1;

public class MushRoom extends ToppingDecorator{
    BasePizza basePizza;

    public MushRoom(BasePizza pizza) {
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() * 20;
    }
}
