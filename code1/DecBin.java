class DecBin{
   public static void main (String a[]){
   
   int n; 
   String bin; String hex;
   
   for (n = 0; n < 256; n ++){
	
		bin = Integer.toBinaryString(n);
		System.out.print(n+" "+bin+"\n");
		n++;
   }
}
}
