package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_2839 {

	public static void main(String[] args) {
		// Nkg의 설탕을 3kg 5kg 두 종류 봉지에 나눠야 한다. 하지만 봉지 개수가 최대한 적어야 한다.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		
		if(N==7 || N==4 || N==2 || N==1) {
			result = -1;
		}
		else if(N%5==0) {
			result = N/5;
		}
		else if(((N - 5*(N/5))) % 3==0) {
			result = N/5 + 1;
		}
		else if((N - 5*((N/5)-1))%3==0) {
			result = ((N/5)-1) +  (N - 5*((N/5)-1))/3;
		}
		else if((N - 5*((N/5)-2))%3==0) {
			result = ((N/5)-2) +  (N - 5*((N/5)-2))/3;
		}
		else if(N%3==0) {
			result = N/3;
		}
		else {
			result = -1;
		}
		System.out.println(result);
	}

}
