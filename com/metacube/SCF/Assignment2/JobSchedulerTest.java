package GET2018.com.metacube.SCF.Assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class JobSchedulerTest {

	JobScheduler calculate = new JobScheduler();
	
	@Test
	public void testJS() {
		int[] waitResult = calculate.waitTime(new int[][]{{0, 10} ,{6, 20}, {60, 50}, {70, 10}}, 4);
		int[] wait = new int[]{0, 4, 0, 40};
		assertArrayEquals(wait, waitResult);
		
		int[] completionResult = calculate.completionTime(new int[][]{{0, 10} ,{6, 20}, {60, 50}, {70, 10}}, 4);
		int[] completion = new int[]{10, 30, 110, 120};
		assertArrayEquals(completion, completionResult);
		
		int[] turnResult = calculate.turnTime(new int[][]{{0, 10} ,{6, 20}, {60, 50}, {70, 10}}, 4);
		int[] turn = new int[]{10, 24, 50, 50};
		assertArrayEquals(turn, turnResult);
		
		float avgWaitResult = calculate.avgWaitTime(new int[][]{{0, 10} ,{6, 20}, {60, 50}, {70, 10}}, 4);
		float avgWait = 11.0f;
		assertEquals(avgWait, avgWaitResult, 0);
		
		int maxWaitResult = calculate.maxWaitTime(new int[][]{{0, 10} ,{6, 20}, {60, 50}, {70, 10}}, 4);
		int maxWait = 40;
		assertEquals(maxWait, maxWaitResult);
	}
	
	@Test(expected = AssertionError.class)
	public void negativeTestJS() {
		int[] waitResult = calculate.waitTime(new int[][]{{0, 10} ,{6, 20}, {-60, 50}, {70, 10}}, 4);
		int[] wait = new int[]{0, 4, 0, 40};
		assertArrayEquals(wait, waitResult);
	}

}
