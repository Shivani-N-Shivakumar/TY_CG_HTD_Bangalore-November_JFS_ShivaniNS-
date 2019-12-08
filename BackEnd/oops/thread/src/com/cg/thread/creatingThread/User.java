package com.cg.thread.creatingThread;

public class User extends Thread {
PVR P;
     User(PVR p) {
    	this.P=p;
    }
    
    public void run() {
    	P.confirmTicket();
    }
}
