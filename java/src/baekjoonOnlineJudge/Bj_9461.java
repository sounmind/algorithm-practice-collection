package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_9461 { // 파도반 수열

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testCase; i++) {
			int n = Integer.parseInt(br.readLine());
			long[] dp = new long[n+1];
			if(1<=n)
				dp[1] = 1;
			if(2<=n)
				dp[2] = 1;
			if(3<=n)
				dp[3] = 1;
			if(4<=n)
				dp[4] = 2;
			if(5<=n)
				dp[5] = 2;
			for(int j=6; j<=n; j++) {
				dp[j] = dp[j-1]+dp[j-5];
			}
			bw.write(Long.toString(dp[n]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

}
