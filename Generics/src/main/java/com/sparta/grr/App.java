package com.sparta.grr;

import java.io.Serializable;

public class App {
    public static void main(String[] args) {
        IntegerRectangle rectangle = new IntegerRectangle(2,4);
        System.out.printf("Integer Rectangle Area: %d\n",
                rectangle.getHeight()*rectangle.getWidth());

        DoubleRectangle doubleRectangle = new DoubleRectangle(2.0,4.0);
        System.out.printf("Double Rectangle Area: %f\n",
                doubleRectangle.getHeight()*doubleRectangle.getWidth());

        ObjectRectangle objectRectangle1 = new ObjectRectangle(2,4);
        ObjectRectangle objectRectangle2 = new ObjectRectangle(2.0,4.0);

        System.out.printf("Object Rectangle 1 Area: %d\n",
                (Integer) objectRectangle1.getHeight()* (Integer) objectRectangle1.getWidth());
        System.out.printf("Object Rectangle 2 Area: %f\n",
                (Double) objectRectangle2.getHeight()* (Double) objectRectangle2.getWidth());

        GenericRectangle<Integer> genericRectangle1 = new GenericRectangle<>(2,4);

        //whatever this creates will become final
        GenericRectangle<?> wildGenericRectangle = new GenericRectangle<>(2,4);

        //this allows anything that extends number
        GenericRectangle<? extends Number> numberGenericRectangle = new GenericRectangle<>(7,4);

        //this allows anything that is a parent of this class,
        //but that also means anything that is a child of its parents aside from object
        GenericRectangle<? super Serializable> integerParentsGenericRectangle = new GenericRectangle<>(7,4);

        System.out.printf("number Generic Rectangle Area: %d\n",
                (Integer) numberGenericRectangle.getHeight()* (Integer) numberGenericRectangle.getWidth());

        System.out.printf("Generic Rectangle 1 Area: %d\n",
                genericRectangle1.getHeight()*genericRectangle1.getWidth());

        GenericRectangle<Double> genericRectangle2 = new GenericRectangle<>(2.0,4.0);
        System.out.printf("Generic Rectangle 2 Area: %f\n",
                genericRectangle2.getHeight()*genericRectangle2.getWidth());


    }
}
