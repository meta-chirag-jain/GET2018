package GET2018.com.metacube.SCF.Assignment2;

/**
 * This class is designed to be a JOb Scheduler on basis of First Come First Serve
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 */
public class JobScheduler {
	
	/**
	 * A utility function to check if errors in input.
	 * @param job is array of arrival time and burst time of process.
	 * @param size is number of process.
	 */
	void checkError(int[][] job, int size) {
		if(size == 0) {
			throw new AssertionError("No jobs to show result");
		}
		for(int i=0; i<size; i++) {
			if(job[i][0] < 0 || job[i][1] < 0) {
					throw new AssertionError("Negative value found.");
			}		
		}
	}
	
	/**
	 * This function calculates waiting time for processes.
	 * @param job is array of arrival time and burst time of process.
	 * @param size is number of process.
	 */
	int[] waitTime(int[][] job, int size) {		
		checkError(job, size);
		int totalTime = job[0][1];
		int[] waitArray = new int[size];
		int timeDiff;
		
		for(int i=1; i<size; i++) {
			if( totalTime - job[i][0] >= 0) {
				waitArray[i] = totalTime - job[i][0];
				totalTime += job[i][1];
			}
			else {
				timeDiff = job[i][0] - totalTime; 
				totalTime = totalTime + job[i][1] + timeDiff;
			}
		}
		return waitArray;
	}
	
	/**
	 * This function calculates completion time for processes.
	 * @param job is array of arrival time and burst time of process.
	 * @param size is number of process.
	 */
	int[] completionTime(int[][] job , int size) {
		checkError(job, size);
		int[] waitArray = waitTime(job, size);
		int[] compTime = new int[size];
		
		for(int i=0; i<size; i++) {
			compTime[i] = waitArray[i] + job[i][0] + job[i][1];
		}
		return compTime;
	}
	
	/**
	 * This function calculates turn around time for processes.
	 * @param job is array of arrival time and burst time of process.
	 * @param size is number of process.
	 */
	int[] turnTime(int[][] job , int size) {
		checkError(job, size);
		int[] waitArray = waitTime(job, size);
		int[] turnTime = new int[size];
		
		for(int i=0; i<size; i++) {
			turnTime[i] = waitArray[i] + job[i][1];
		}
		return turnTime;
	}
	
	/**
	 * This function calculates average waiting time for processes.
	 * @param job is array of arrival time and burst time of process.
	 * @param size is number of process.
	 */
	float avgWaitTime(int[][] job , int size) {
		checkError(job, size);
		float avgWait = 0;
		int[] waitArray = waitTime(job, size);
		for(int i=0; i<size; i++) {
			avgWait = avgWait + waitArray[i];
		}
		avgWait /= size;
		return avgWait;
	}
	
	/**
	 * This function calculates maximum waiting time for processes.
	 * @param job is array of arrival time and burst time of process.
	 * @param size is number of process.
	 */
	int maxWaitTime(int[][] job , int size) {
		checkError(job, size);
		int maxWait = 0;
		int[] waitArray = waitTime(job, size);
		for(int i=0; i<size; i++) {
			if(maxWait < waitArray[i]) {
				maxWait = waitArray[i];
			}
		}
		return maxWait;
	}

}