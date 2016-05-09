package com.eheinen.questions.question03;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class ArrayListPerf extends CollectionPerf<ArrayList<Integer>> {

	@Override
	protected ArrayList<Integer> getCollection() {
		ArrayList<Integer> listInt = new ArrayList<>();
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
		ArrayList<Integer> listInt = this.getCollection();
		start = LocalTime.now();
		listInt.get(SEARCH_INDEX);
		end = LocalTime.now();
		return ChronoUnit.MILLIS.between(start, end);
	}

}
