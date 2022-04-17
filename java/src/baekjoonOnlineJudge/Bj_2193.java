package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_2193 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		long[] dp = new long[N+1];
		
		if(N<=2) {
			bw.write("1");
		} else {
			dp[1] = 1;
			dp[2] = 1;
			for(int i=3; i<=N; i++) {
				dp[i] = dp[i-1] + dp[i-2];
			}
			bw.write(Long.toString(dp[N]));
		}
		bw.flush();
		bw.close();
	}
}
