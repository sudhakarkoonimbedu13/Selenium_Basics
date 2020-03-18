package com.thread;

public class ThreadJoinDemo4 extends Thread
{

	public static void main(String[] args) throws InterruptedException 
	{
		Thread.currentThread().join();

	}

}
