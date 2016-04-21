package com.eheinen.exec_02;

/**
 * Converta um número inteiro positivo de decimal para binário.
 *   - Ex.: 12 (decimal) = 1100 (binário)
 * Utilize:
 *  • % (módulo)
 *  • Integer.toString(int valor);
 *
 * @author Eduardo Heinen
 */

public class ConverterDecimalToBinary {
	public String Convert(int decimal){
		String binarySequence = "";
		
		while(decimal > 0){
			int mod = decimal%2;
			decimal /= 2;
			binarySequence = Integer.toString(mod) + binarySequence;
		}
		
		return binarySequence;
	} 
}