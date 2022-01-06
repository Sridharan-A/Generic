package org.generic;

public class GenericDemo <T>{
    T ob;

    public GenericDemo(T ob) {
        this.ob = ob;
    }
    T getOb(){
        return ob;
    }

    public void showType(){
        System.out.println(ob.getClass().getName());
    }

    public static void main(String[] args) {
        GenericDemo<Integer> gi=new GenericDemo<>(4);
        gi.showType();
        int v=gi.getOb();
        System.out.println(v);

        GenericDemo<String> gs=new GenericDemo<>("fgvdfv");
        gs.showType();
        String a=gs.getOb();
        System.out.println(a);
    }

}
