package com.basics.arrays;
class Equiments{
    String name;
    int Equipment_id;
    String Lab;
    double voltage;
    Boolean working;
    public Equiments(String name, int Equipment_id,String Lab,double voltage,Boolean working){
        this.name=name;
        this.Equipment_id=Equipment_id;
        this.Lab=Lab;
        this.voltage=voltage;
        this.working=working;

    }

}

public class E9 {
    public static void main(String[] args) {
        Equiments[] Equiment = new Equiments[]{
                new Equiments("fshjv", 890, "DSP", 90.0, true),
                new Equiments("dmwd", 789, "dsdv", 89.09, false),
                new Equiments("RTAAA", 89, "electrical", 89.89, false)
        };

    for (Equiments equiments:Equiment){
        System.out.println(equiments.name+""+equiments.Equipment_id+" "+equiments.Lab+" "+equiments.voltage+" "+equiments.working);

    }
        System.out.println();

    }
}

