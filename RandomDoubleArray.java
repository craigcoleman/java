// Code by CWColeman - 180320 and wnw (who knows when)
import java.util.*;
class RandomDoubleArray {
	public static void main (String args[])throws InterruptedException{
		int i;
		int max = 52;
		int matches;
		int maxMatches = 0;
		int shuffles = 0;
		// define arrays
		double randomNumbers[] = new double[max];
		double sortedNumbers[] = new double[max];
		int randomInt[] = new int[max];
		int sortInt[] = new int[max];
		for(;;){ // this is an infinite for loop
			matches = 0;
			// build the array
			for ( i = 0; i < max; i++){ 
				randomNumbers[i] = Math.random() *52;
				randomInt[i] = (int)randomNumbers[i];
			}
			// copy the array
			for (i = 0;  i < max; i++){
				//sortedNumbers[i] = randomNumbers[i];
				sortInt[i] = randomInt[i];
			}
			//sort the array
			   Arrays.sort(sortedNumbers);  
			   Arrays.sort(sortInt);
			// this sorts the array     
			System.out.println("\narray sorted\n");
			// display the array
			for ( i = 0; i < max; i++){ 
				//System.out.println(randomNumbers[i]+" "+sortedNumbers[i]);
				//if (randomNumbers[i]==sortedNumbers[i]) System.out.print(" * * * * * * * * ");
				System.out.print(randomInt[i]+"  "+ sortInt[i]);
				if (randomInt[i]==sortInt[i])
					{  matches++;
						System.out.print(" * "+matches+" MATCHES  * \n");
					}
				else
					{
						System.out.println();
					}
			}
			shuffles++;
			if (matches > maxMatches)
				{maxMatches = matches;}
			System.out.println("* * * * * * * * * * * * *");
			System.out.println("MAXIMUM MATCHES -> "+maxMatches);
			System.out.println("* * * * * * * * * * * * *");
			System.out.println("MSHUFFLES       -> "+shuffles);
			System.out.println("* * * * * * * * * * * * *");
			Thread.sleep(1000);
	}//end infinite loop for (;;)
		
	}//end main
}//end class
