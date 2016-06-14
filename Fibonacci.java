//derived from http://www.java2novice.com/java-interview-programs/fibonacci-series/  Aman Shekhar
// cw coleman

import java.util.Scanner;
class Fibonacci {
	public static void main(String[] args) {
		int a = 0, b = 1, f = 0, n;
		System.out.println("Enter the limit");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("\n");
		for(int i = 0; i<=n; i++) {
			System.out.println(f);
			a = b;
			b = f;
			f = a + b;
		}
	}
}
