package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_2749 { // 피보나치 수 3 | 피사노 주기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		// 피보나치 수를 나눌 수를 K라고 할 때, K=10^n이면, 피사노 주기는 15*10^(n-1)이다.
		// 피사노 주기까지의 피보나치 수를 K로 나눈 값들을 구하면, 나머지는 그대로 반복된다.
		int DENOMINATOR = 1000000;
		int K = (int) Math.log10(DENOMINATOR);
		int PISANO = (int) Math.pow(10, K-1) * 15;
		
		long[] dp = new long[PISANO];
		dp[0] = 0;
		dp[1] = 1;
	
		for(int i=2; i<PISANO && i<=n; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % DENOMINATOR;
		}
		if( n >= PISANO) {
			n %= PISANO;
		}
		System.out.println(dp[(int)n]);
		
	}

}
// 풀이 참고: https://qlyh8.tistory.com/162