// 161019: : : : : : : : : : : : : : : : : : : : 
//cwcoleman * * * * * * * * * * * * * 
class LowToMin{
	public static void main (String args[]){
			
			double random;
			double minValue = -1;
			double nextValue = -1;
			int count = 0;
			int acount = 0; //accending count
			boolean done = false;
			
			while (count < 100){
				random = Math.random();
				if (count == 0) {
					minValue = random;
				}else{
					nextValue = random;
				}
				
				if (nextValue > minValue){
					acount++; 
				}
				
				System.out.print(random+" ");
				count++;
			}
			System.out.println("\n acount"+acount);

	}
}

