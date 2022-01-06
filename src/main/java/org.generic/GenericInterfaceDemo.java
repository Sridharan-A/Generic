package org.generic;

public class GenericInterfaceDemo<T> implements GenericInterface<T> {

    T[] arrarRef;
    GenericInterfaceDemo(T[] o){
        this.arrarRef=o;
    }

    public static void main(String[] args) {
        Integer[] i={1,2,3};
        String[] s={"how","are","you"};

        GenericInterfaceDemo<Integer> gidInteger=new GenericInterfaceDemo(i);
        GenericInterfaceDemo<String> gidString=new GenericInterfaceDemo(s);

        System.out.println(gidInteger.containsValue(2));
        System.out.println(gidString.containsValue("you"));


    }

    public boolean containsValue(T t) {
        for(T x:arrarRef){
            if(x.equals(t)) return true;
        }
        return false;
    }



}
