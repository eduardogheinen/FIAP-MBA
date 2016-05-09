package com.eheinen.questions.question03;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Stack;

public class StackPerf extends CollectionPerf<Stack<Integer>> {

	@Override
	protected Stack<Integer> getCollection() {
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<MAX_SIZE; i++){
			stack.push(i);
		}
		return stack;
	}

	@Override
	public long getIncludePerformance() {
		start = LocalTime.now();
		this.getCollection();
		end = LocalTime.now();
		return ChronoUnit.MILLIS.between(start, end);
	}

	@Override
	public long getSearchPerformance() {
		Stack<Integer> listInt = this.getCollection();
		start = LocalTime.now();
		listInt.get(SEARCH_INDEX);
		end = LocalTime.now();
		System.out.println(start);
		System.out.println(end);
		return ChronoUnit.MILLIS.between(start, end);
	}

}
