package assignment1;

import java.util.Scanner;

public class JobScheduler {
	/*int compTime()
	{
		return 0;
	}
	int waitTime()
	{
		return 0;
	}
	int turnTime()
	{
		return 0;
	}
	int avgWaitTime()
	{
		return 0;
	}
	int maxWaitTime()
	{
		return 0;
	}*/
	

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
	
		
		int totalTime = job[0][1];
		int[] waitArray = new int[size];
		int timeDiff;											//initially all 0
		
		for(int i=1; i<size; i++) {
			if( totalTime - job[i][0] >= 0)						//else wait time 0
			{
				waitArray[i] = totalTime - job[i][0];
				totalTime += job[i][1];
			}
			else
			{
				timeDiff = job[i][0] - totalTime; 
				totalTime = totalTime + job[i][1] + timeDiff;
			}
		}
		
		
		int[] compTime = new int[size];
		int[] turnTime = new int[size];
		
		for(int i=0; i<size; i++) {
			compTime[i] = waitArray[i] + job[i][0] + job[i][1];				//job[i][0] is arrival time
			turnTime[i] = waitArray[i] + job[i][1];							//job[i][1] is exec time
		}
		
		System.out.println("Array is: ");
		System.out.println("wait comp turn");
		
		for(int i=0; i<size; i++){
				System.out.println(waitArray[i] + " " + compTime[i] +" " + turnTime[i]);
		}
		 
	}

}