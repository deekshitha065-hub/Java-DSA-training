package com.basics.threads;

public class TicketTask implements Runnable{

    String task;
    TicketTask(String task){
        this.task=task;
    }
    public void run(){
        System.out.println(task + " in progress.");

    }

    public static void main(String[] args) {
        Thread t1=new Thread(new TicketTask("seat Allocation")

        );
        Thread t2=new Thread(new TicketTask("Payment process"));
        Thread t3=new Thread(new TicketTask("sms verfication"));
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
// Implements runnable interafce
/// better in design
//// preferrend by interviewers
/////supports multople inhertaience
 */
