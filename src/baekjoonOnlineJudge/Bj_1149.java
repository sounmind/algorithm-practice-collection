package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_1149 { // RGB거리
	
	static int[][] dp;
	static int[][] houses;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		dp = new int[1000+1][3+1];
		houses= new int[1000+1][3+1];
		int N = Integer.parseInt(br.readLine());
		for(int i=1; i<=N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			houses[i][1] = Integer.parseInt(st.nextToken());
			houses[i][2] = Integer.parseInt(st.nextToken());
			houses[i][3] = Integer.parseInt(st.nextToken());
		}
		for(int i=1; i<=3; i++) {
			dp[1][i] = houses[1][i];
		}
		for(int i=2; i<=N; i++) {
			dp[i][1] = houses[i][1] + Math.min(dp[i-1][2], dp[i-1][3]);
			dp[i][2] = houses[i][2] + Math.min(dp[i-1][1], dp[i-1][3]);
			dp[i][3] = houses[i][3] + Math.min(dp[i-1][1], dp[i-1][2]);
		}
		System.out.println(Math.min(dp[N][1], Math.min(dp[N][2], dp[N][3])));
	}

}
