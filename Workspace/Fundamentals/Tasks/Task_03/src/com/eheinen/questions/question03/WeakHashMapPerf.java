package com.eheinen.questions.question03;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.WeakHashMap;

public class WeakHashMapPerf extends CollectionPerf<WeakHashMap<Integer, Integer>> {

	@Override
	protected WeakHashMap<Integer, Integer> getCollection() {
		WeakHashMap<Integer, Integer> hash = new WeakHashMap<>();
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
		WeakHashMap<Integer, Integer> hash = this.getCollection();
		start = LocalTime.now();
		hash.get(SEARCH_INDEX);
		end = LocalTime.now();
		return ChronoUnit.MILLIS.between(start, end);
	}

}
