import java.util.Random; 

class IsPrime {
	boolean prime;
			int  d;// x is the number to check to be prime
			double dn, nd; //change dn will 
			int pivot;
	boolean isprime (int n){
		nd = n;
		prime = true;//assume value is prime then prove false
		pivot = (int)Math.sqrt(n);
			for (d = 2; d < pivot+1;d ++){
				
				dn = d; //assign n to dn
				if ((n % 2 == 0) && (n > 2) || (n == 0)) {prime = false; break;} 
				//System.out.println(n+" "+n/dn+ " "+n/d);
				if ((nd / dn) == (n / d)) {prime = false; break;}
			}
			if (prime) {
			//System.out.print(n + " ");
		}
		return prime;
	}
}


class RandInt {    
	public static void main(String[] args){   
	int i, number , max, count = 0;
	int[] hit ; hit = new int[65536];
	
	boolean checkPrime = false;
	IsPrime is = new IsPrime();
	Random rand = new Random();      
	for (i = 0; i< 10; i++){     
		   number = rand.nextInt(100); 
		   //System.out.print(number+" "); 
		   hit[number]++;
		   checkPrime = is.isprime(number);   
		   if (checkPrime == true){count++; System.out.println(number+" is prime ");} 
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
