package com.eheinen.questions.question_02;

public class Airport extends Thread {

	private boolean isTrackOneAvailable = false;

	public boolean isTrackOneAvailable() {
		return isTrackOneAvailable;
	}

	public void setTrackOneAvailable(boolean isTrackOneAvailable) {
		this.isTrackOneAvailable = isTrackOneAvailable;
	}

	public synchronized boolean waitForAvailableTrack() throws InterruptedException {
		return isTrackOneAvailable;
	}

	public synchronized void changeTrackStatus() throws InterruptedException {
		isTrackOneAvailable = (isTrackOneAvailable) ? false : true;
		sleep(3000);
		System.out.println((isTrackOneAvailable) ? "Track is Available!" : "Track is not Available");
		notifyAll();
	}

	@Override
	public void run() {
		setName("Airport Thread");
		while (isAlive()) {
			try {
				changeTrackStatus();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
