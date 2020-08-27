package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_11053 { // 가장 긴 증가하는 부분 수열

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int numbers[] = new int[n+1];
		int dp[] = new int[n+1];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= n; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		dp[1] = 1;
		for (int i = 1; i <= n; i++) {
			dp[i] = 1;
			for (int j = 1; j <= i; j++) {
				System.out.printf("i=%d, j=%d |", i, j);
				if (numbers[j] < numbers[i] && dp[i] <= dp[j]) { // i번째 수열 값이 j번째보다 크고, i번째까지의 증가하는 수열 크기가 j번째까지의 크기 이하일 때
					dp[i] = dp[j] + 1;
					for(int k=1; k<=n; k++) {
						System.out.printf("%2d ", dp[k]);
					}
					System.out.print(" | dp[i] = dp[j] + 1");
				} 
				else {
					for(int k=1; k<=n; k++) {
						System.out.printf("%2d ", dp[k]);
					}
				}
				System.out.println();
			}
		}
		int max = 0;
		for (int i : dp) {
			max = Math.max(max, i);
		}
		System.out.println(max);
	}
}
// 풀이 참고: https://developer-mac.tistory.com/71