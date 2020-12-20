package com.company;

public class Counder<T extends Number> implements Calculate<T> {
// <>-эти скобки означают обобщение. T- это название того , что мы принимаем (неизвестное)
private T second;

    public Counder(T second) {
        this.second = second;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public void plus(T first) {
        System.out.println(first.intValue()+getSecond().intValue());
        //first - неизвестное чило и с помощью int мы определили что это целое число .
    }

    @Override
    public void minus(T first) {
        System.out.println(first.intValue()-getSecond().intValue());
    }
}
