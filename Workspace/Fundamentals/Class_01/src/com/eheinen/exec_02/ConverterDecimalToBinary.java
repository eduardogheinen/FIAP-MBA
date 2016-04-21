package com.eheinen.exec_02;

/**
 * Converta um n�mero inteiro positivo de decimal para bin�rio.
 *   - Ex.: 12 (decimal) = 1100 (bin�rio)
 * Utilize:
 *  � % (m�dulo)
 *  � Integer.toString(int valor);
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