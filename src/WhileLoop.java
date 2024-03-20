import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int num=1;
		sum=0;
		while(num<=n){
			//System.out.println(num);
			sum=num+sum;
			num++;
		}
		System.out.println(sum);

	}

}
