package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_1463 { // DP | 1로 만들기 (Bottom-up)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dp[] = new int[n + 1];
		dp[0] = dp[1] = 0; 				// 초기화
		for (int i = 2; i <= n; i++) { 	// 최종 숫자는 n이기 때문에 n까지 반복연산
			dp[i] = dp[i - 1] + 1; 		// n-1을 1로 만드는 최소 횟수
            if (i % 2 == 0) {			// n/2를 1로 만드는 최소 횟수
            	dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0) {			// n/3을 1로 만드는 최소 횟수
            	dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
		for(int i=1; i<=n; i++) {
			System.out.print(dp[i]+" ");
		}
		System.out.println();
		System.out.println(dp[n]);
		sc.close();
	}
}
// 풀이 출처: http://blog.naver.com/PostView.nhn?blogId=occidere&logNo=220787315353&proxyReferer=http:%2F%2Fm.blog.naver.com%2F
