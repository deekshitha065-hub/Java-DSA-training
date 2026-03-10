package com.basics.arrays;
//Arrays of Object {Students} {Internals} {books} {pens}
class Students{
    String name;
    int USN;
}
class intern{
    String name;
    int id;
    public intern(String name, int id) {
        this.id = id;
        this.name = name;
    }


}
public class E8 {
    public static void main(String[] args) {
        Students[] students=new Students[3];
        students[0]=new Students();
        students[0].name="FHAAAAAA";
        students[0].USN=78;
        System.out.println(students[0].name+" " + students[0].USN);
        intern[] interns=new intern[]{
                new intern("FHAAA",101),
                new intern("kjhsgf",56),
                new intern("tyf",789)

        };
        for(intern i:interns){
            System.out.println(i.name+" "+ i.id);
        }
    }
}
