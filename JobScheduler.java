package assignment1;

import java.util.Scanner;

public class JobScheduler {
	
	int[] waitTime(int[][] job, int size) {
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
	
	int[] completionTime(int[][] job , int size) {
		int[] waitArray = waitTime(job, size);
		int[] compTime = new int[size];
		
		for(int i=0; i<size; i++) {
			compTime[i] = waitArray[i] + job[i][0] + job[i][1];
		}
		return compTime;
	}
	
	int[] turnTime(int[][] job , int size) {
		int[] waitArray = waitTime(job, size);
		int[] turnTime = new int[size];
		
		for(int i=0; i<size; i++) {
			turnTime[i] = waitArray[i] + job[i][1];
		}
		return turnTime;
	}
	
	float avgWaitTime(int[][] job , int size) {
		float avgWait = 0;
		int[] waitArray = waitTime(job, size);
		for(int i=0; i<size; i++) {
			avgWait = avgWait + waitArray[i];
		}
		avgWait /= size;
		return avgWait;
	}
	
	int maxWaitTime(int[][] job , int size) {
		int maxWait = 0;
		int[] waitArray = waitTime(job, size);
		for(int i=0; i<size; i++) {
			if(maxWait < waitArray[i]) {
				maxWait = waitArray[i];
			}
		}
		return maxWait;
	}
	

	public static void main(String[] args) {
		int size;
		System.out.println("Enter number of Jobs: ");
		Scanner scan = new Scanner(System.in);
		size = scan.nextInt();
		
		int[][] job = new int[size][2];
		
		System.out.println("enter array");
		for(int i=0; i<size; i++){
			for(int j=0; j<2; j++){
				job[i][j] = scan.nextInt();
			}
		}
	
		JobScheduler jobCalc = new JobScheduler();
		
		int[] waitArray = jobCalc.waitTime(job, size);
		
		int[] compArray = jobCalc.completionTime(job, size);
		
		int[] turnArray = jobCalc.turnTime(job, size);
		
		float avgWaitTime = jobCalc.avgWaitTime(job, size);
		
		int maxWaitTime = jobCalc.maxWaitTime(job, size);
		
		System.out.println("avg wait " + avgWaitTime);
		System.out.println("max wait " + maxWaitTime);

		System.out.println("wait comp turn");
		
		for(int i=0; i<size; i++){
				System.out.println( waitArray[i] + "\t" + compArray[i]  +"\t" + turnArray[i]);
		}		 
	}
}
