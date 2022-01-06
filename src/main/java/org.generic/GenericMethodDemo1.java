package org.generic;

import java.util.Comparator;

public class GenericMethodDemo1 {
    public static void main(String[] args) {
        GenericMethodDemo1 gmd1=new GenericMethodDemo1();
        gmd1.<Integer>show(101);
        //gmd1.<String>show("java");
    }
    public <T extends Number> void show(T data){
        System.out.println("Entered data is : "+data);
        System.out.println("Object class name : "+data.getClass().getName());
    }
}
