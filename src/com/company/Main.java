package com.company;

public class Main {

    public static void main(String[] args) {
        Counder<Integer> counder=new Counder<>(14);
        //<Integer> - тут мы пишем тип целого числа .
        counder.plus(12);
        counder.minus(5);

    }
}
