package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_2839 {

	public static void main(String[] args) {
		// Nkg의 설탕을 3kg 5kg 두 종류 봉지에 나눠야 한다. 하지만 봉지 개수가 최대한 적어야 한다.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		
		while(N>0) {
			if(N % 5 == 0) {
				N -= 5;
				result++;
				System.out.println("N="+N+", result="+result);
			}
			else if(N % 3 == 0) {
				N -= 3;
				result++;
				System.out.println("N="+N+", result="+result);
				
			}
			else if(N > 5) {
				N -= 5;
				result++;
				System.out.println("N="+N+", result="+result);
			}
			else {
				result = -1;
				System.out.println("N="+N+", result="+result+" and break");
				break;
			}
		}
		
		
		System.out.println(result);
	}

}
