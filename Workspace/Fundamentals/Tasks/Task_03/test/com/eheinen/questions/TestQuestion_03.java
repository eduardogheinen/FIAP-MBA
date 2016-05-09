package com.eheinen.questions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

import org.junit.Before;
import org.junit.Test;

import com.eheinen.questions.question03.ArrayListPerf;
import com.eheinen.questions.question03.HashMapPerf;
import com.eheinen.questions.question03.HashSetPerf;
import com.eheinen.questions.question03.LinkedListPerf;
import com.eheinen.questions.question03.StackPerf;
import com.eheinen.questions.question03.WeakHashMapPerf;

/**
 * 
 * @author Eduardo Heinen
 *
 */

public class TestQuestion_03 {

	private Question_03 question;
	private ArrayListPerf arrayList;
	private HashMapPerf hashMap;
	private HashSetPerf hashSet;
	private LinkedListPerf linkedList;
	private StackPerf stack;
	private WeakHashMapPerf weakHashMap;
	
	@Before
	public void setup(){
		question = new Question_03();
		arrayList = null;
		hashMap = null;
		hashSet = null;
		linkedList = null;
		stack = null;
		weakHashMap = null;
		
		System.gc();
		
		arrayList = new ArrayListPerf();
		hashMap = new HashMapPerf();
		hashSet = new HashSetPerf();
		linkedList = new LinkedListPerf();
		stack = new StackPerf();
		weakHashMap = new WeakHashMapPerf(); 
	}

	// Test time to include greater than zero:
	
	@Test
	public void testTimeToIncludeArrayListGreaterThanZero() {
		assertThat(arrayList.getIncludePerformance(), greaterThan(0L));
	}
	
	@Test
	public void testTimeToIncludeHashMapGreaterThanZero() {
		assertThat(hashMap.getIncludePerformance(), greaterThan(0L));
	}
	
	@Test
	public void testTimeToIncludeHashSetGreaterThanZero() {
		assertThat(hashSet.getIncludePerformance(), greaterThan(0L));
	}
	
	@Test
	public void testTimeToIncludeLinkedListGreaterThanZero() {
		assertThat(linkedList.getIncludePerformance(), greaterThan(0L));
	}
	
	@Test
	public void testTimeToIncludeStackGreaterThanZero() {
		assertThat(stack.getIncludePerformance(), greaterThan(0L));
	}
	
	@Test
	public void testTimeToIncludeWeakHashMapGreaterThanZero() {
		assertThat(weakHashMap.getIncludePerformance(), greaterThan(0L));
	}
	
	// Test time to search greater than zero:
	
	@Test
	public void testTimeToSearchArrayListGreaterThanZero() {
		assertThat(arrayList.getSearchPerformance(), greaterThanOrEqualTo(0L));
	}
	
	@Test
	public void testTimeToSearchHashMapGreaterThanZero() {
		assertThat(hashMap.getSearchPerformance(), greaterThanOrEqualTo(0L));
	}
	
	@Test
	public void testTimeToSearchHashSetGreaterThanZero() {
		assertThat(hashSet.getSearchPerformance(), greaterThan(0L));
	}
	
	@Test
	public void testTimeToSearchLinkedListGreaterThanZero() {
		assertThat(linkedList.getSearchPerformance(), greaterThan(0L));
	}
	
	@Test
	public void testTimeToSearchStackGreaterThanZero() {
		assertThat(stack.getSearchPerformance(), greaterThanOrEqualTo(0L));
	}
	
	@Test
	public void testTimeToSearchWeakHashMapGreaterThanZero() {
		assertThat(weakHashMap.getSearchPerformance(), greaterThanOrEqualTo(0L));
	}

	// Test include comparation:
	
	@Test
	public void testIncludeCompareArrayListAndLinkedList() {
		assertThat(linkedList.getIncludePerformance(), greaterThan(arrayList.getIncludePerformance()));
	}
	
	@Test
	public void testIncludeCompareStackAndHashSet() {
		assertThat(hashSet.getIncludePerformance(), greaterThan(stack.getIncludePerformance()));
	}
	
	@Test
	public void testIncludeCompareHashMapAndWeakHashMap() {
		assertThat(weakHashMap.getIncludePerformance(), greaterThan(hashMap.getIncludePerformance()));
	}
	
	// Test compare comparation:
	
	@Test
	public void testSearchCompareArrayListAndLinkedList() {
		assertThat(linkedList.getSearchPerformance(), greaterThan(arrayList.getSearchPerformance()));
	}
	
	@Test
	public void testSearchCompareStackAndHashSet() {
		assertThat(hashSet.getSearchPerformance(), greaterThan(stack.getSearchPerformance()));
	}
	
	@Test
	public void testSearchCompareHashMapAndWeakHashMap() {
		assertThat(weakHashMap.getSearchPerformance(), greaterThanOrEqualTo(hashMap.getSearchPerformance()));
	}
}
