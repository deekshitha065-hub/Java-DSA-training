package com.basics.oops.pillars.inheritance.herarchical;

public class User {
    void role(){
        System.out.println("Generic user");

    }
}
class admin extends User{
    @Override
    void role(){
        System.out.println("admin user");
    }


    }
    class guest extends User{
        @Override
        void role() {
            System.out.println(" guest user");
        }


        }
        class demo {

            public static void main(String[] args) {
                User user = new User();
                user.role();
                //upcasting
                User user1 = new admin();
                user1.role();
                User user2 = new guest();
                user2.role();
            }
        }
//ℹ️✔️ the reference doesn't matter - the reference matters