package com.eheinen.questions;

import java.util.ArrayList;
import java.util.Collections;

import com.eheinen.questions.question04.Person;

/**
 * Desenvolva um aplicativo onde deverá ser criada uma classe chamada Pessoa
 * com os seguintes atributos: nome (String), idade (int), sexo (char) e empresa
 * (String). Depois crie uma coleção do tipo ArrayList de 5 objetos desta classe
 * conforme tabela abaixo. Mostre como resultado em console, as seguintes
 * informações solicitadas, utilizando a classe utilitária Collections (pode ser
 * necessário alguma implementação na classe Pessoa para a execução de
 * determinados itens):
 *    Nome            Idade       Sexo          Empresa
 * João Garcia         20           M       AIK Enterprises
 * Maria Martins       44           F       Simples
 * Henrique Fernando   43           M       AIK Enterprises
 * Inácio Luís         33           M       Magazine André
 * Fernando Ferreira   87           M       Casas Recife
 * 
 * a. Sortear a lista e retirar uma pessoa;
 * b. Ordenação da lista baseado no atributo nome;
 * c. Inverter a ordem da lista baseado no atributo nome;
 * 
 * @author Eduardo Heinen
 */

public class Question_04 {

	public ArrayList<Person> buildArrayList(){
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("João Garcia", 20, 'M', "AIK Enterprises"));
		list.add(new Person("Maria Martins", 44, 'F', "Simples"));
		list.add(new Person("Henrique Fernando", 43, 'M', "AIK Enterprises"));
		list.add(new Person("Inácio Luís", 33, 'M', "Magazine André"));
		list.add(new Person("Fernando Ferreira", 87, 'M', "Casas Recife"));
		return list;
	}
	
	public ArrayList<Person> shuffleAndRemove(){
		ArrayList<Person> list = buildArrayList();
		Collections.shuffle(list);
		list.remove(0);
		this.logArrayList(list);
		return list;
	}
	
	public ArrayList<Person> sortByName(){
		ArrayList<Person> list = buildArrayList();
		Collections.sort(list);
		this.logArrayList(list);
		return list;
	}
	
	public ArrayList<Person> reverseByName(){
		ArrayList<Person> list = buildArrayList();
		Collections.sort(list, Collections.reverseOrder());
		this.logArrayList(list);
		return list;
	}
	
	public void logArrayList(ArrayList<Person> list){
		System.out.println("\n");
		list.forEach(l -> System.out.println(l));
	}
}