package com.eheinen.questions;

import java.util.HashMap;

/**
 * Crie um sistema que seja respons�vel por medir a efici�ncia de busca de alguns
 * tipos de objetos da classe de cole��es do Java. O sistema dever� incluir nos
 * determinados tipos de cole��es 1.000.000 entradas do tipo inteiro de n�meros
 * seq�enciais. Utilize um la�o para efetuar a inser��o dos valores. Depois dos
 * dados estarem nas cole��es, dever� ser solicitado a busca da entrada 500.000.
 * Para cole��es que necessitam de uma chave, utilize o mesmo valor da entrada,
 * por exemplo, para o valor de entrada 1, a chave tamb�m ser� 1.
 * Compare o tempo tanto de inser��o de dados quanto de busca para cada tipo de
 * cole��o que ser� solicitada abaixo. Para a compara��o de tempo, utilize sempre
 * na unidade de milissegundos.
 * Por meio deste aplicativo, indique quais s�o os melhores tipos de cole��es para
 * inser��o e busca de informa��o.
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
