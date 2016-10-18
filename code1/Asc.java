class Asc{
   public static void main (String a[]){
   
   int n; char c;
   String bin; String hex;
   
   n = 32;
   
   while (n < (32+26)){
		c = (char)n;
		hex = Integer.toHexString(n);
		bin = Integer.toBinaryString(n);
		System.out.print(n+" "+c+" "+hex+" "+bin+"\n");
		n++;
   }
}
}
