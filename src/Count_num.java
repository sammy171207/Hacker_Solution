import java.util.Scanner;

public class Count_num {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int numofDigits=0;
		while(n>0){
			n=n/10;
			numofDigits++;//
		}
		System.out.println("Number of digits in  "+n+"="+numofDigits);

	}

}
