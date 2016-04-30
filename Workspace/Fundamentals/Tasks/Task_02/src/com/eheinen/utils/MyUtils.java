package com.eheinen.utils;

import javax.swing.JOptionPane;

/**
 * 
 * @author Eduardo Heinen
 *
 */

public class MyUtils {
	
	/**
	 * Responsible for validate is a number passed is a float valid
	 * @param number Number to be validated.
	 * @return True is a valid float or False is invalid float.
	 */
	public boolean isValidFloat(String number){
		try {
		    Float.parseFloat(number);
		    return true;
		} catch (NumberFormatException e) {
		    return false;
		}
	}
	
	/**
	 * Responsible for get an typed value, check if the value is valid and convert.
	 * @param message Message to show in the input form.
	 * @return Formatted number.
	 */
	public float getNum(String message){
		boolean isValid = false;
		String num = "";
		while(isValid == false){
			num = JOptionPane.showInputDialog(message);
			if(num == null)
				throw new NullPointerException();
			isValid = new MyUtils().isValidFloat(num);
		}
		return Float.valueOf(num);
	}
}
