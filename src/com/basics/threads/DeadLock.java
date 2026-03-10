package com.basics.threads;

public class DeadLock {
    static final Object accountA=new Object();
    static final Object account_B=new Object();

    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            synchronized (accountA){
                System.out.println("thraed 1 locked  Account A");
                try{
                    Thread.sleep(3000);
                }catch (Exception e){

                }
                synchronized (account_B){
                    System.out.println("thread 1 locked accountB");
                }
            }
        });
        Thread t2=new Thread(()->{
            synchronized (account_B){
                System.out.println("thraed 2 locked Account A ");
                try{
                    Thread.sleep(3000);
                }catch (Exception e){

                }
                synchronized (accountA){
                    System.out.println("thread 2 locked accountB");
                }
            }

        });
        t1.start();
        t2.start();
    }

}
/*
/*
Points to remember
Thread 1 acquires a lock on accountA and then sleeps,giving
Thread 2 time to acquire a lock on AccountB;
thread 1 waits for Account A& Thread 2 waits for accountB
Scine neither thread releases the lock,both keep waiting for each other creating a Deadlock❌ Situation
✅Deadlock Explanation:Deadlock occurs when each thread is holding
a resource and waiting for the other thread to release it.
➡️When deadlock occurs ,it will not destroy the app,it will freeze it premanently.
HOw to reslove deadlock->Write a better code!!!
 */

