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
		
		int[] coins = new int[10];
		
		for(int i=0; i<N; i++)
			coins[i] = Integer.parseInt(br.readLine());
		
		int i;
		int coinCount = 0;
		
		for(i=N-1; i>=0; i--)
			if(coins[i]<=K)
				break;
		
		while(K >= coins[i]) {
			K -= coins[i];
			coinCount++;
			if(K==0)
				break;
			if(K < coins[i]) {
				while(true)
					if(K >= coins[--i])
						break;
			}
		}
		System.out.println(coinCount);
	}

}
