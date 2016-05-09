package com.eheinen.questions.question03;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

public class HashMapPerf extends CollectionPerf<HashMap<Integer, Integer>> {

	@Override
	protected HashMap<Integer, Integer> getCollection() {
		HashMap<Integer, Integer> hash = new HashMap<>();
		for(int i=0; i<MAX_SIZE; i++){
			hash.put(i, i);
		}
		return hash;
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
		HashMap<Integer, Integer> hash = this.getCollection();
		start = LocalTime.now();
		hash.get(SEARCH_INDEX);
		end = LocalTime.now();
		return ChronoUnit.MILLIS.between(start, end);
	}

}
