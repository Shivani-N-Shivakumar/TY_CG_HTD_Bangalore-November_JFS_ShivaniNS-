package com.cg.thread.creatingThread;

public class User1 extends Thread {
	IRCTC i;
    User1(IRCTC i) {
   	this.i=i;
   }
   
   public void run() {
   	i.confirmTicket();
   }
}
