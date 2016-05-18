package com.eheinen.questions.question_01;

public class Thread_03 extends Thread {

	private Thread[] threads;
	
	public Thread_03(Thread... threads) {
		this.threads = threads;
	}
	
	@Override
	public synchronized void run(){
		while (isAlive()){
			try {
				for(Thread thread : threads){
					System.out.println("Name: " + thread.getName() + " - Status: " + thread.isAlive());
				}
				sleep(5000);				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
