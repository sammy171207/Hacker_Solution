import java.util.Scanner;

public class Reverse_theDigit {
/////Reverse the String 
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int ans=0;
	int original=n;
	while(n>0){
		ans=ans*10+n%10;
		n/=10;
		
	}
	System.out.println("Reverse the digit "+ans);
	

	}

}
