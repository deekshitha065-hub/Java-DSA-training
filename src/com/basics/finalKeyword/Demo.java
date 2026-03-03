package com.basics.finalKeyword;

public final class Demo {
}
class A {
    final int x=200;
    //x=300; cannot change
    void display(final int x){
        //x=10; cannot assign value to a final parameter
    }

}