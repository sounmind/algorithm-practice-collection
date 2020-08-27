package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_1912 { // 연속합
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n = sc.nextInt(), max; 
		int numbers[] = new int[n+1], dp[] = new int[n+1];
		
		for(i = 1; i <= n; i++) {
			numbers[i] = sc.nextInt();
		}
		max = dp[1] = numbers[1];
		for(i = 2; i <= n; i++) {
			dp[i] = Math.max(numbers[i], dp[i-1]+numbers[i]); 
			if(dp[i] > max)
				max = dp[i];
		}
		
		System.out.println(max);
		sc.close();
	}
	
}
// 풀이 참고: https://zoonvivor.tistory.com/152