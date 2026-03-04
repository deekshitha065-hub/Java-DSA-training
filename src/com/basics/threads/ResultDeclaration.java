package com.basics.threads;

public class ResultDeclaration {
    private static Object rd;

    synchronized void declareResult() throws Exception {
        System.out.println("Admin wating  for approval");
        wait();
        System.out.println("Exam Results declare......");
    }
    synchronized  void approve(){
        notify();
    }

    public static void main(String[] args) throws InterruptedException {
        ResultDeclaration rd=new ResultDeclaration();
        new Thread(()->{
            try{
                rd.declareResult();
            }catch (Exception e){}

        }).start();
        Thread.sleep(2000);
        new Thread(()->rd.approve()).start();
    }
}
