import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		int sumofDigits=0;
		int original_n=n;
		while(n>0){
			sumofDigits+=n %10;
			n=n/10;
		}
		/////Sum of the digit
		System.out.println("Sum of the Digits of "+original_n+" ="+sumofDigits);

	}
	

}
