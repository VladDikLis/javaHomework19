package ru.java.otus.basic.homework;

public class JavaHovework {
    public static void main(String[] args) {

        Apple apple1 = new Apple(220);
        Apple apple2 = new Apple(200);
        Apple apple3 = new Apple(210);

        Orange orange1 = new Orange(130);
        Orange orange2 = new Orange(120);
        Orange orange3 = new Orange(150);

        Box<Apple> boxApple = new Box<>();
        Box<Orange> boxOrange = new Box<>();
        Box<Orange> boxOrange2 = new Box<>();
        Box<Fruit> boxFruit = new Box<>();

        boxApple.addFruit(apple1, apple2, apple3);
        boxOrange.addFruit(orange1, orange2, orange3);
        boxFruit.addFruit(orange1, orange2, orange3);

        System.out.println("Сравнение двух коробки с фруктами и апельсинами по весу: " + boxFruit.comparisonBox(boxOrange));

        boxOrange.boxInBox(boxOrange2);
    }
}
