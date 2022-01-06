package org.generic;

public class GenericWithTwoParam<T,V> {
    T ob1;
    V ob2;

    GenericWithTwoParam(T a,V b){
        this.ob1=a;
        this.ob2=b;
    }
    T getOb1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }

    void show(){
        System.out.println(ob1.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }

    public static void main(String[] args) {
        GenericWithTwoParam<Integer,String> gt=new GenericWithTwoParam<>(1,"asdf");
        gt.show();
        System.out.println(gt.getOb1());
        System.out.println(gt.getOb2());
    }

}
