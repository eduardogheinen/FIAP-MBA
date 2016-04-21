package com.eheinen.exec_01;

/**
 * Crie uma classe Cliente que possua os seguintes construtores:
 *	Cliente()
 *	Cliente(numeroRG)
 *	Cliente(numeroRG, numeroCPF, endereco, nome)
 * Faça com que o construtor com os 4 argumentos chame o construtor com 1
 * argumento que, por sua vez, chame o construtor default.
 * Todos os atributos podem ser modelados com String.
 *	
 * @author Eduardo Heinen
 */

public class Customer {
	private String numberRG;
	private String numberCPF;
	private String address;
	private String name;
	
	public Customer(){
		System.out.println("Default Construtor!");
	}
	
	public Customer(String numberRG){
		this();
		this.numberRG = numberRG;		
	}
	
	public Customer(String numberRG, String numberCPF, String address, String name){
		this(numberRG);
		this.numberRG = numberRG;
		this.numberCPF = numberCPF;
		this.address = address;
		this.name = name;
	}

	public String getNumberRG() {
		return numberRG;
	}

	public void setNumberRG(String numberRG) {
		this.numberRG = numberRG;
	}

	public String getNumberCPF() {
		return numberCPF;
	}

	public void setNumberCPF(String numberCPF) {
		this.numberCPF = numberCPF;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return numberRG + " - " + numberCPF + " - " + address + " - " + name;
	}
}
