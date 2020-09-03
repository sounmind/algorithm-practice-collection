package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_12865 { // 평범한 배낭 | 배낭에 넣을 수 있는 물건들의 가치합의 최댓값을 구하자
/*
N : stuff given which you can put in your bag, 		K: weight you can hold, 
W: weight of each stuff, 							V: value of each stuff	
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), K=sc.nextInt();
		int[] W = new int[N+1];
		int[] V = new int[N+1];
		int[][] dp = new int[N+1][K+1]; // 행: 물건 종류, 열: 무게 1 ~ K
		for(int i=1; i<=N; i++) {
			W[i] = sc.nextInt();
			V[i] = sc.nextInt();
		}
		for(int i=1; i<=N; i++) {
			for(int j=1; i<=K; j++) {
				dp[i][j] = dp[i-1][j]; // 해당 요소는 이전 물건의 가치로 초기화
				if(j - W[i] > 0) {	// 해당 요소의 무게를 할당 무게에서 뺐을 때 0 이상이라면 == 무게 제한에 걸리지 않았다면,
					// max(이전 물건까지의 가치합, 현재 물건 가치 + 남은 무게만큼 뺀 용량에서 물건들의 가치합)
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - W[i]]+V[i]);
				}
			}
		}
		System.out.println(dp[N][K]);
	}

}
// 풀이 참고: https://fbtmdwhd33.tistory.com/60?category=737465