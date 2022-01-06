package org.generic;

public class GenericNumberReciprocal<T extends Number> {
    T ob;

    public GenericNumberReciprocal(T a){
        ob=a;
    }

    double reciprocal(){
        return 1/ob.doubleValue();
    }

    public static void main(String[] args) {
        GenericNumberReciprocal<Integer> gi;
        gi=new GenericNumberReciprocal<>(4);
        System.out.println(gi.reciprocal());

        GenericNumberReciprocal<Float> gf;
        gf=new GenericNumberReciprocal<>(-.5f);
        System.out.println(gf.reciprocal());
    }
}
