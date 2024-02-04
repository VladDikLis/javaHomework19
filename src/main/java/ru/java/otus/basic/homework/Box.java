package ru.java.otus.basic.homework;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T... fruit) {
        T[] array = fruit;
        for (T f : array) {
            fruits.add(f);
        }
        System.out.println("Фрукты в коробке. Всего фруктов: " + fruits.size() + ". Вес: " + weight());
    }

    public int weight() {
        int a = 0;
        for (T fruit : fruits) {
            a += fruit.getWeight();
        }
        return a;
    }

    public boolean comparisonBox(Box<?> box) {
        return this.weight() == box.weight();
    }

    public void boxInBox(Box<? super T> box){
        if (box == this){
            return;
        }
        box.fruits.addAll(this.fruits);
        this.fruits.clear();
        System.out.println("Фрукты в коробке. Всего фруктов: " + box.fruits.size() + ". Вес: " + box.weight());
    }
}