package org.generic;

public class GenericMethodDemo {

    <T extends Comparable<T>,V extends T> boolean isEqual(T[] t,V[] v){
        if(t.length!=v.length) return false;
        for(int i=0;i<t.length;i++){
            if(!t[i].equals(v[i])) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        GenericMethodDemo gm=new GenericMethodDemo();
        Integer[] a={1,2,3};
        Integer[] a1={1,2,3};
        Number[] n={1,2,3};
        Float[] f={1.2f,3.2f};
        Float[] f1={1.4f,3.2f};
        Byte[] b={1,2,3};
        System.out.println(gm.isEqual(a,a1));

    }
}
