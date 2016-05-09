package com.eheinen.questions.question03;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;

public class LinkedListPerf extends CollectionPerf<LinkedList<Integer>> {

	@Override
	protected LinkedList<Integer> getCollection() {
		LinkedList<Integer> listInt = new LinkedList<>();
		for(int i=0; i<MAX_SIZE; i++){
			listInt.add(i);
		}
		return listInt;
	}

	@Override
	public long getIncludePerformance() {
		start = LocalTime.now();
		this.getCollection();
		end = LocalTime.now();
		System.out.println(ChronoUnit.MILLIS.between(start, end));
		return ChronoUnit.MILLIS.between(start, end);
	}

	@Override
	public long getSearchPerformance() {
		LinkedList<Integer> listInt = this.getCollection();
		start = LocalTime.now();
		listInt.get(SEARCH_INDEX);
		end = LocalTime.now();
		return ChronoUnit.MILLIS.between(start, end);
	}

}
