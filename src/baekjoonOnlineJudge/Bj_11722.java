package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_11722 { // 가장 긴 감소하는 부분 수열

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int numbers[] = new int[n+1], dp[] = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			numbers[i] = sc.nextInt();
		}
		for(int i = 1; i <= n; i++) {
			dp[i] = 1;
			for(int j = 1; j <= i; j++) {
				if(numbers[j] > numbers[i] && dp[j] >= dp[i])
					dp[i] = dp[j] + 1;
//				for(int k=1; k<=n; k++)
//					System.out.printf("%d ", dp[k]);
//				System.out.println();
			}
			if(dp[i] > max)
				max = dp[i];
		}
		System.out.println(max);
		sc.close();
	}

}
