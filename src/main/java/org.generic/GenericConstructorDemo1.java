package org.generic;

public class GenericConstructorDemo1 {
    private int sum;

    public <T extends Number> GenericConstructorDemo1(T t) {
        sum=0;
        for(int i=0;i<=t.intValue();i++){
            sum+=i;
        }
    }
    public int getSum(){
        return sum;
    }

    public static void main(String[] args) {
        GenericConstructorDemo1 gd1=new GenericConstructorDemo1(-5);
        System.out.println(gd1.getSum());
    }
}
