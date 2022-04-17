package baekjoonOnlineJudge;
import java.util.Scanner;

public class Bj_2439 {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int h=0; h<num-i-1; h++) {
				System.out.printf(" ");
			}
			for(int j=i; j>=0; j--) {
				System.out.printf("*");
			}
			System.out.println("");
		}
    }
}
