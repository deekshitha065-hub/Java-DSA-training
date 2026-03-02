package com.basics.oops.pillars.inheritance.single;

public class Library {
    String name;
    int id;

    public Library(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Books extends Library{
    double price;
    Books(int id, String name,double price){
        super(id, name);
        this.price=price;
    }
    void bookdetails(){
        System.out.println(id + " " + name + " " + price);
    }

    public static void main(String[] args) {
        Books Books=new Books(190,"you cannot win",546);
        Books.bookdetails();
    }

}
