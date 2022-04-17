package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_2156 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		// 와인 용량 배열과 점화식 배열 선언 
		int[] wineAmount = new int[N+1];
		int[] dp = new int[N+1];
		
		// 와인 용량 입력
		for(int i=1; i<=N; i++) { 
			wineAmount[i] = Integer.parseInt(br.readLine());
		}
		// 초기화
		dp[1] = wineAmount[1];
		if(N>1) {
			dp[2] = wineAmount[1] + wineAmount[2];
		}
		// 점화식 입력
		for(int i=3; i<=N; i++) {
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + wineAmount[i], wineAmount[i] + wineAmount[i-1] + dp[i-3]));
		}
		bw.write(Integer.toString(dp[N]));
		bw.flush();
		bw.close();
	}
}
// 풀이 참고: https://limkydev.tistory.com/112
// 정리: https://www.notion.so/leeshkr/2156-11053-11055-e35d76b457f04ba3ad3f5a08ea47939f