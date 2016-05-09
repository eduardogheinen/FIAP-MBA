package com.eheinen.questions;

import java.util.HashMap;

/**
 * Crie um sistema que seja responsável por medir a eficiência de busca de alguns
 * tipos de objetos da classe de coleções do Java. O sistema deverá incluir nos
 * determinados tipos de coleções 1.000.000 entradas do tipo inteiro de números
 * seqüenciais. Utilize um laço para efetuar a inserção dos valores. Depois dos
 * dados estarem nas coleções, deverá ser solicitado a busca da entrada 500.000.
 * Para coleções que necessitam de uma chave, utilize o mesmo valor da entrada,
 * por exemplo, para o valor de entrada 1, a chave também será 1.
 * Compare o tempo tanto de inserção de dados quanto de busca para cada tipo de
 * coleção que será solicitada abaixo. Para a comparação de tempo, utilize sempre
 * na unidade de milissegundos.
 * Por meio deste aplicativo, indique quais são os melhores tipos de coleções para
 * inserção e busca de informação.
 * 	a. ArrayList e LinkedList
 * 	b. Stack e HashSet
 * 	c. HashMap e WeakHashMap
 * 
 * @author Eduardo Heinen
 */

public class Question_03 {

	public long getDifference(long input1, long input2){
		return input1 - input2;
	}
	
	public String getBestCollection(HashMap<String, Long> hash){
		int best = 0;
		for(int i=0; i<hash.size(); i++){
			if(hash.get(i) > best)
				best = i;
		}
		return hash.get(best).toString();
	}
}
