package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_11047 { // 동전 0 |  K원을 만드는데 필요한 동전 개수의 최솟값은?

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // 동전 단위의 종류
		int K = Integer.parseInt(st.nextToken()); // 목표 금액
		int i, coinCount = 0;
		int[] coins = new int[10];
		
		for(i=0; i<N; i++)
			coins[i] = Integer.parseInt(br.readLine());
		
		for(i=N-1; i>=0; i--) {
			if(coins[i]<=K) {
				coinCount+=K/coins[i];
				K=K%coins[i];
			}
		}
		System.out.println(coinCount);
	}
	
}
// 풀이참고: https://www.acmicpc.net/source/15567861
