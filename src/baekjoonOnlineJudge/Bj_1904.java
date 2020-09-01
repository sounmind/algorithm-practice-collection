package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_1904 { // 01타일

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int i, N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        if(N>=1)
        	dp[1] = 1;
        if(N>=2)
        	dp[2] = 2;
        for(i=3; i<=N; i++) {
        	dp[i] = ( dp[i-1] + dp[i-2] ) % 15746;
        }
        bw.write(Integer.toString(dp[N]));
        bw.flush();
        br.close(); bw.close();
	}

}
// 풀이 참고: https://wellohorld.tistory.com/17