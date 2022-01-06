package org.generic;

public class GenericConstructorDemo2 {
    private double doubleValue;
    public <T extends Number> GenericConstructorDemo2(T t) {
        doubleValue=t.doubleValue()*2;
    }

    public double getDoubleValue(){
        return doubleValue;
    }

    public static void main(String[] args) {
        GenericConstructorDemo2 gd=new GenericConstructorDemo2(5.776f);
        System.out.println(gd.getDoubleValue());
    }
}
