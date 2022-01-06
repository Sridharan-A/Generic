package org.generic;

public class GenericTwoParamWithBound<T,V extends T> {
    T ob1;
    V ob2;

    public GenericTwoParamWithBound(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    void show(){
        System.out.println(ob1.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }

    public static void main(String[] args) {
        GenericTwoParamWithBound<Number,Integer> gt=new GenericTwoParamWithBound<>(34534L,34);
        gt.show();
    }
}
