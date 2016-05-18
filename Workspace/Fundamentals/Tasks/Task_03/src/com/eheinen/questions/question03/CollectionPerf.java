package com.eheinen.questions.question03;

import java.time.LocalTime;

public abstract class CollectionPerf<T> {

	protected LocalTime start;
	protected LocalTime end;
	protected final int MAX_SIZE = 1_500_000;
	protected final int SEARCH_INDEX = 500_000;
	
	protected abstract T getCollection();
	protected abstract long getIncludePerformance();
	protected abstract long getSearchPerformance();
	
}
