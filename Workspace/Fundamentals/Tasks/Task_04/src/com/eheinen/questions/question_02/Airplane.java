package com.eheinen.questions.question_02;

public class Airplane extends Thread {

	private String flightName;
	private Airport airport;
	private Status status = Status.WAITING;

	public Airplane(String flightName, Airport airport) {
		this.flightName = flightName;
		this.airport = airport;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}

	public synchronized void fly() throws InterruptedException {
		if (status.equals(Status.FLYING)) {
			System.out.println(flightName + " is Flying");
			sleep(2000);
		}
	}

	public synchronized void takeoff() throws InterruptedException {
		if (status.equals(Status.WAITING)) {
			if (airport.waitForAvailableTrack()) {
				System.out.println(flightName + " is Taking Off");
				status = Status.FLYING;
				airport.changeTrackStatus();
			} else 
				status = Status.WAITING;
		}
	}

	public synchronized void land() throws InterruptedException {
		if (status.equals(Status.FLYING) || status.equals(Status.LANDING)) {
			if (airport.waitForAvailableTrack()) {
				System.out.println(flightName + " is Landing");
				status = Status.WAITING;
				airport.changeTrackStatus();
			} else 
				status = Status.LANDING;
		}
	}

	@Override
	public void run() {
		setName("Airplane " + flightName + " Thread");
		try {
			while (isAlive()) {
				takeoff();
				fly();
				land();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
