import java.util.*;
class LRandom{
	public static void main (String a[]){
		long seed = Long.parseLong(25);
		Random random = new Random(seed);
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println(random.nextInt());
		}
	}
}
