package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_2775 { // 부녀회장이 퇼테야

	public static void main(String[] args) throws IOException {
		// 아파트가 총 "K층", "N호"일 때 ( 아파트는 0층부터 있고, 1<=k<=14, 1<=N<=14 )
		// K층 N호 거주민은 K층 N-1호 거주민 + K-1층 N호 거주민의 합이다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		for(int k=0; k<testCase; k++) {
			int K = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			int[][] apartment = new int[K+1][N+1];
			
			for(int i=1; i<=N; i++) // 0층의 i호에는 i명이 거주
				apartment[0][i] = i;
			
			for(int i=1; i<=K; i++)
				for(int j=1; j<=N; j++)
					apartment[i][j] = apartment[i][j-1] + apartment[i-1][j]; 
			bw.write(Integer.toString(apartment[K][N]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
