package com.basics.oops.pillars.inheritance.multi;

public class SimpleCalculator {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void subtract(int a,int b){
        System.out.println(a-b);
    }
}
class AdvanceCaculator extends SimpleCalculator{
    void divide(int a,int b){
        System.out.println(a/b);

    }
    void multiple(int a, int b){
        System.out.println(a*b);
    }
}
class Superadvancecalculator extends AdvanceCaculator{
    void Square(int x){
        System.out.println(Math.pow(x,2));

    }
    void cube(int x){
        System.out.println(Math.pow(x,3));
    }

    public static void main(String[] args) {
        System.out.println("===========================");
        SimpleCalculator c1=new SimpleCalculator();
        c1.add(89,78);
        c1.subtract(67,56);
        System.out.println("===========================");
        AdvanceCaculator c2=new AdvanceCaculator();
        c2.add(34,67);
        c2.subtract(700000,337733);
        c2.divide(45678,45667);
        c2.multiple(3456789,3456789);
        System.out.println("===========================");
        Superadvancecalculator c3=new Superadvancecalculator();
        c3.add(4567,5678);
        c3.subtract(4567,456789);
        c3.divide(45678,456789);
        c3.multiple(34567,56789);
        c3.cube(567);
        c3.cube(456789);
    }
}