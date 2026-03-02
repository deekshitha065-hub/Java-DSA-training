package com.basics.oops.pillars.polymorphism.overriding;

public class RBI {
    double rateofinterset(){
        return 6.8;
    }

}
class HDFC extends RBI{
    @Override
    double rateofinterset() {
        return 7.2;
    }

}
class ICIC extends RBI{
    @Override
    double rateofinterset(){
        return 7.8;
}


}
class canara extends RBI{
    @Override
    double rateofinterset(){
        return 7.9;
    }

    public static void main(String[] args) {
        // upcasting -> parent obj = new child();
        RBI rbi=new RBI();
        HDFC hdfc=new HDFC();
        ICIC icic=new ICIC();
        canara Canara=new canara();
        System.out.println("the roi of rbi is: " + " " + rbi.rateofinterset() + "%");
        System.out.println("the roi of rbi is: " + " " + hdfc.rateofinterset() + "%");
        System.out.println("the roi of rbi is: " + " " + icic.rateofinterset() + "%");
        System.out.println("the roi of rbi is: " + " " + Canara.rateofinterset() + "%");
    }
}