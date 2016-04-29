package com.eheinen.utils;

/**
 * 
 * @author Eduardo Heinen
 *
 */

public class MyUtils {
	
	/**
	 * Responsible for build a sequencial array through a number passed and with amount passed either.
	 * @param number Number initial to start the senquence.
	 * @param amount Amount of sequencial numbers.
	 * @return Sequencial Array
	 */
	public int[] buildSequencialArray(int number, int amount){
		int[] sequencialArray = new int[amount];
		for (int i=0; i<sequencialArray.length; i++) {
			sequencialArray[i] = number++;
		}
		return sequencialArray;
	}
	
	/**
	 * Responsible for print in console all values in an integer array.
	 * @param myArray Integer array to be printed.
	 */
	public void printArray(int[] myArray){
		System.out.println("Start to print:");
		for (int i : myArray) {
			System.out.println(i);
		}
		System.out.println("End to print.\n");
	}
	
	/**
	 * Responsible for validate is a number passed is a double valid
	 * @param number Number to be validated.
	 * @return True is a valid double or False is invalid double.
	 */
	public boolean isValidDouble(String number){
		try {
		    Double.parseDouble(number);
		    return true;
		} catch (NumberFormatException e) {
		    return false;
		}
	}
	
	/**
	 * Responsible for validate is a number passed is a integer valid
	 * @param number Number to be validated.
	 * @return True is a valid integer or False is invalid integer.
	 */
	public boolean isValidInteger(String number){
		try {
		    Integer.parseInt(number);
		    return true;
		} catch (NumberFormatException e) {
		    return false;
		}
	}
	
	/**
	 * Responsible for compare the operator passed to return the correct enumeration to be calculated.
	 * @param operator Operator to be validated.
	 * @return The correct enum related to the operator passed.
	 * @throws WrongOptionException If the user passes a wrong operator.
	 */
	public OperatorEnum getOperator(String operator) throws WrongOptionException{
		if(OperatorEnum.SUM.getOperator().equals(operator))
			return OperatorEnum.SUM;
		else if(OperatorEnum.MINUS.getOperator().equals(operator))
			return OperatorEnum.MINUS;
		else if(OperatorEnum.MULTIPLY.getOperator().equals(operator))
			return OperatorEnum.MULTIPLY;
		else if(OperatorEnum.DIVIDE.getOperator().equals(operator))
			return OperatorEnum.DIVIDE;
		else
			throw new WrongOptionException("You need to type a valid operator like: +  -  *  /");
	}
}
