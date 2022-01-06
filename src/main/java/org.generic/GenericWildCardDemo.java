package org.generic;

public class GenericWildCardDemo<T extends Number> {
    T ob;

    public GenericWildCardDemo(T ob) {
        this.ob = ob;
    }

    boolean isAbsEqual(GenericWildCardDemo<?> t){
        if(Math.abs(ob.doubleValue())==Math.abs(t.ob.doubleValue())) return true;
        return false;
    }

    boolean test(GenericWildCardDemo<? super Float> t){
        if(Math.abs(ob.doubleValue())==Math.abs(t.ob.doubleValue())) return true;
        return false;
    }

    public static void main(String[] args) {
        GenericWildCardDemo<Integer> gi=new GenericWildCardDemo<>(-5);
        GenericWildCardDemo<Float> gf=new GenericWildCardDemo<>(5.00f);
        System.out.println(gf.isAbsEqual(gi));

        System.out.println(gi.test(gf));

    }
}
