package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_9095 { // 1,2,3 더하기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int caseCount = Integer.parseInt(br.readLine());
		int[] testCase = new int[caseCount];
		int[] dp = new int[11];
		for(int i=0; i<caseCount; i++) {
			testCase[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0; i<caseCount; i++) {
			int n = testCase[i];
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;
			for(int j=4; j<=n; j++) {
				dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
			}
			bw.write(Integer.toString(dp[n]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
