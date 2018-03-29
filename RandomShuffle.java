// Code by CWColeman - 180330 and wnw (who knows when)
import java.util.*;

class RandomShuffle {
	public static void  printArray(int rInts[]){
		for (int i = 0; i < rInts.length; i++){
				System.out.print(rInts[i]+" ");
				if ((i != 0) && (i % 10 == 0))
					System.out.println();
		}
	}
	
	public static int[] swapInts(int baseInts[],int n, int first,int last){
		int i;
		for(i = n; i < last-1; i++){
			baseInts[i] = baseInts[i+1];
		}
			baseInts[last-1] = -1;
		return baseInts;
	}
	
	public static int[] shuffle(int baseInts[],int randomInts[], int max){
		int i = 0;
		int last;
		int n;
		while (i < max){
			last = max-i;
			n = (int)(Math.random() *last);
			System.out.println ("i "+i+" n "+n+" last "+last);
			randomInts[i] = baseInts[n];		
			baseInts[n] = -1;
			System.out.println("1 BASE SHUFFLE * * * * * * * * * * * * *");
			printArray(baseInts);
			System.out.println("\n* * * * * * * * * * * * *\n");
			baseInts = swapInts(baseInts,n,i,last);
			System.out.println("2 BASE SHUFFLE * * * * * * * * * * * * *");
			printArray(baseInts);
			System.out.println("\n* * * * * * * * * * * * *\n");
			i++;
		}//edn while
		return randomInts;
	}

	public static void main (String args[])throws InterruptedException{
		int i; // loop variable i
		int max = 6; // maximum number of cards
		// define arrays
		int baseInts[] = new int[max];
		int randomInts[] = new int[max];
		for (i = 0; i < max; i++) {
				baseInts[i] = i;
				randomInts[i] = -1;
		}
		System.out.println("BASE MAIN* * * * * * * * * * * * *");
		printArray(baseInts);
		System.out.println("\n* * * * * * * * * * * * *");
		randomInts = shuffle(baseInts,randomInts,max);
		System.out.println("\n RANDOM INTS* * * * * * * * * * * * *");
		printArray(randomInts);
		System.out.println("\n* * * * * * * * * * * * *\n");
	}//end main
}//end class


/*
public means that the method is visible and can be called from other 
* objects of other types. Other alternatives are private, protected, 
* package and package-private. See here for more details.
* 
static means that the method is associated with the class, 
* not a specific instance (object) of that class. 
* This means that you can call a static method without 
* creating an object of the class.

void means that the method has no return value. 
* If the method returned an int 
* you would write int instead of void.

The combination of all three of these is most 
* commonly seen on the main method which most 
* tutorials will include.

 */
