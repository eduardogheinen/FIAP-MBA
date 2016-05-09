package com.eheinen.main;

import com.eheinen.questions.DateFormat;
import com.eheinen.questions.Question_02;
import com.eheinen.questions.Question_03;
import com.eheinen.questions.question03.ArrayListPerf;
import com.eheinen.questions.question03.HashMapPerf;
import com.eheinen.questions.question03.HashSetPerf;
import com.eheinen.questions.question03.LinkedListPerf;
import com.eheinen.questions.question03.StackPerf;
import com.eheinen.questions.question03.WeakHashMapPerf;

public class Main {

	public static void main(String[] args){
		
		// Task 1:
		// a) 2 Objects
		// b) Using Buffer to manipulate the Strings
		
		
		// Task 2:
		Question_02 question_02 = new Question_02();
		System.out.println(question_02.getDateFormatted(DateFormat.DT_FORMAT_01));
		System.out.println(question_02.getDateFormatted(DateFormat.DT_FORMAT_02));
		System.out.println(question_02.getDateFormatted(DateFormat.DT_FORMAT_03));
		System.out.println(question_02.getDateFormatted(DateFormat.DT_FORMAT_04));
		System.out.println(question_02.getDateFormatted(DateFormat.DT_FORMAT_05));
		
		try {
			question_02 = new Question_02("10/09/2012 12:00:00");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(question_02.getDateFormatted(DateFormat.DT_FORMAT_01));
		System.out.println(question_02.getDateFormatted(DateFormat.DT_FORMAT_02));
		System.out.println(question_02.getDateFormatted(DateFormat.DT_FORMAT_03));
		System.out.println(question_02.getDateFormatted(DateFormat.DT_FORMAT_04));
		System.out.println(question_02.getDateFormatted(DateFormat.DT_FORMAT_05));
		
		
		// Task 3:
		Question_03 question_03 = new Question_03();
		ArrayListPerf arrayList = new ArrayListPerf();
		HashMapPerf hashMap = new HashMapPerf();
		HashSetPerf hashSet = new HashSetPerf();
		LinkedListPerf linkedList = new LinkedListPerf();
		StackPerf stack = new StackPerf();
		WeakHashMapPerf weakHashMap = new WeakHashMapPerf(); 
		
		
	}
	
}
