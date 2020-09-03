package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_9251 { // LCS: Longest Common SubSequence

	public static void main(String[] args) throws IOException { // LCS (Longest Common Subsequence)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine(); 
		String B = br.readLine();
		int[][] dp = new int[B.length()+1][A.length()+1]; // B의 모든 요소를 차례로 A와 비교
		for(int i=1; i <= B.length(); i++) {
			for(int j=1; j <= A.length(); j++) {
				if(B.charAt(i-1) != A.charAt(j-1)) // B의 i번째 요소가 A의 j번째 요소와 다르면
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]); // 테이블에서 해당 요소의 Max(왼쪽 값, 위쪽 값)를 대입
				else
					dp[i][j] = dp[i-1][j-1] + 1; // 테이블 해당 요소의 왼쪽 위 대각선 값 +1 대입
			}
		}
		System.out.println(dp[B.length()][A.length()]);
	}

}
// 풀이 참고: https://fbtmdwhd33.tistory.com/58
// 참고 동영상: https://youtu.be/P-mMvhfJhu8