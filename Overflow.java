// 161019: : : : : : : : : : : : : : : : : : : : 
//cwcoleman * * * * * * * * * * * * * 
class OverFlow {

	public static void main (String a[]){
		// 2^31 = 2147483648
		int s = 2147483000;
				for (int i = 0; i < 1000;i++){
					s = s + 1;
					System.out.print(" "+s);
				}
			

	}
}

