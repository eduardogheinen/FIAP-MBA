package com.eheinen.exec_01;

public class Horse implements Runnable {

	private String name;
	
	public Horse(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		try {
			int i=1;
			while (i<11){
				Thread.sleep((int)(Math.random() * 5000));				
				System.out.println(name + " " + (i++)*100/10 + "% percorridos...");
			}	
			System.out.println("========" + name + " cruza linha de chegada! ========");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
