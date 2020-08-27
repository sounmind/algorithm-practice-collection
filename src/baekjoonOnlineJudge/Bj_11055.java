package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_11055 { // 가장 큰 증가 부분 수열

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int n = sc.nextInt(); 
		int max = 0;
		int numbers[] = new int[n+1], dp[] = new int[n+1];
		
		for(i=1;i<=n;i++) {
			numbers[i] = sc.nextInt();
		}	
		for(i = 1; i <= n; i++){
			dp[i] = numbers[i];
			for(j = 1; j < i; j++) {
				if(numbers[j] < numbers[i] && dp[i] < (dp[j] + numbers[i]) ) {
					dp[i] = dp[j] + numbers[i];
				}
			}
			if(max < dp[i]) {
				max = dp[i];
			}
		}
		System.out.println(max);
		sc.close();
	}
}
// 풀이 참고: https://m.blog.naver.com/occidere/220793914361