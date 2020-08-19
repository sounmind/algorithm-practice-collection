package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_11726 { // 2*n 타일링	
	static int[] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new int[n+1];
		System.out.println(tile(n));
		sc.close();
	}
	public static int tile(int n) {
		if(n<=2) {
			return n;
		}
		if(dp[n] != 0) {
			return dp[n];
		}
		dp[n] = (tile(n-2)+tile(n-1))%10007;
		return dp[n];
	}
}
