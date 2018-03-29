import java.util.Random; 

class IsPrime {
	boolean prime;
			int  d;// x is the number to check to be prime
			int pivot;
	boolean isprime (int n){
		prime = true;//assume value is prime then prove false
		pivot = (int)Math.sqrt(n);
			for (d = 2; d < pivot+1;d ++){		
				if (n % d == 0){		prime = false; break;}
			}
			//if (prime) {
			//System.out.print(n + " ");
			//}
		return prime;
	}
}

class RandIntPrime {    
	public static void main(String[] args){   
	int i, number , max, count = 0;
	int[] hit ; hit = new int[65536];
	
	boolean checkPrime = false;
	IsPrime is = new IsPrime();
	Random rand = new Random();      
	for (i = 0; i< 100; i++){     
		   number = rand.nextInt(100); 
		   //System.out.print(number+" "); 
		   hit[number]++;
		   checkPrime = is.isprime(number);   
		   if (checkPrime == true){count++; System.out.print(number+" is prime ");} 
			//System.out.print(checkPrime+" ");      
		} 
		//System.out.println("\n\n count the primes = "+count); 
		//System.out.println("\n\n *******\n"); 
		//for (i = 0; i<65536; i++){
		//		if(hit[i] > 0){ System.out.print(i+" "+hit[i]+" "); 
		//}
	//}
		
}
}
