package com.eheinen.questions;

import com.eheinen.utils.MyUtils;

/**
 * Crie um programa que leia a seqüência de um determinado vetor (array) e
 * depois escreva, em seqüência inversa, em outro vetor. Por exemplo, se o vetor A = {1,2,3}, então vetor B = {3,2,1}.
 * 
 * @author Eduardo Heinen
 */

public class Question_01 {

	private int[] sequencialArray;
	private MyUtils utils;
	
	public Question_01(int number, int amount){
		utils = new MyUtils();
		sequencialArray = utils.buildSequencialArray(number, amount);
	}
	
	public int[] getSequencialArray(){
		return sequencialArray;
	}
	
	public int[] invert(){
		utils.printArray(sequencialArray);
		
		int[] newSequencialArray = new int[sequencialArray.length];
		int index = 0;
		for(int i=sequencialArray.length - 1; i>=0; i--){
			newSequencialArray[index++] = sequencialArray[i];
		}
		
		utils.printArray(newSequencialArray);
		return newSequencialArray;
	}
	
}
