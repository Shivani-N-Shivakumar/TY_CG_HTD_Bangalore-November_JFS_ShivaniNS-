package com.cg.thread.creatingThread;

public class Theard2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<4;i++)	{
			System.out.println(i);
		}
	}

	
}
