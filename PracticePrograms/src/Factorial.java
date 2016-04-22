

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int sum=1;
		for(int i=2; i<=n;i++){
			sum=sum*i;
		}
	System.out.println(sum);


	}

}
