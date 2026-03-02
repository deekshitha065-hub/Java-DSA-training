package com.basics.oops.pillars.inheritance.multiple;

public interface Icecream {
    String icecream1();
    String icecream2();
    String icecream3();
}
class IceCreams implements Icecream{

    @Override
    public String icecream1() {
        return "person 1 likes ButterScotch";
    }

    @Override
    public String icecream2() {
        return "person 2 likes Vanilla";
    }

    @Override
    public String icecream3() {
        return "person 2 likes Blueberry";
    }

    public static void main(String[] args) {
        IceCreams iceCreams=new IceCreams();
        System.out.println(iceCreams.icecream1());
        System.out.println(iceCreams.icecream2());
        System.out.println(iceCreams.icecream3());
    }
}
