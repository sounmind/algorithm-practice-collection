package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_2579 { // 계단 오르기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n = sc.nextInt(); 
		int numbers[] = new int[n+1], dp[] = new int[n+1];
		for(i = 1; i <= n; i++) {
			numbers[i] = sc.nextInt();
		}
		if(n>=1)
			dp[1] = numbers[1];
		if(n>=2)
			dp[2] = numbers[1] + numbers[2];
		if(n>=3)
			dp[3] = Math.max(numbers[1] + numbers[3], numbers[2] + numbers[3]);
		for(i = 4; i <= n; i++) {
			dp[i] = Math.max(numbers[i] + numbers[i-1] + dp[i-3], numbers[i] + dp[i-2]);
		}
//		for(i=1; i<=n; i++)
//			System.out.printf("%d ", dp[i]);		
		System.out.println(dp[n]);
		sc.close();
	}

}
// 참고: https://sundries-in-myidea.tistory.com/22