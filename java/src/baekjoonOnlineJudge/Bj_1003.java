package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1003 { // 피보나치 함수
	// "0"이 나오는 횟수는 n=1일 때 0, n=2일 때 1인 피보나치 수열
	// "1"이 나오는 횟수는 n=1일 때 1, n=2일 때 1인 피보나치 수열		
	static int[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		dp = new int[40+1];
		int N = Integer.parseInt(br.readLine());
		int[] cases = new int[N];
		for(int i=0; i<N; i++) {
			cases[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = 0;
		dp[1] = 1;
		for(int i=2; i<=40; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		for(int i=0; i<N; i++) {
			if(cases[i]==0) {
				System.out.println("1 0");
			} else if(cases[i]==1) {
				System.out.println("0 1");
			} else {
				System.out.printf("%d %d\n", dp[cases[i]-1], dp[cases[i]]);
			}
		}
	}

}
