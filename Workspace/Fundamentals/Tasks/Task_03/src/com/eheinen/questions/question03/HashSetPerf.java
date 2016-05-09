package com.eheinen.questions.question03;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPerf extends CollectionPerf<HashSet<Integer>> {

	@Override
	protected HashSet<Integer> getCollection() {
		HashSet<Integer> hash = new HashSet<>();
		for(int i=0; i<MAX_SIZE; i++){
			hash.add(i);
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
		HashSet<Integer> hash = this.getCollection();
		start = LocalTime.now();
		Iterator<Integer> iter = hash.iterator();
		int count = 0;
		while (iter.hasNext() && count < SEARCH_INDEX) {
		    count++;
		}
		end = LocalTime.now();
		return ChronoUnit.MILLIS.between(start, end);
	}

}
