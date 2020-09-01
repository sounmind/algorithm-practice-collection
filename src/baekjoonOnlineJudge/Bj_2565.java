package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bj_2565 { // 전깃줄 제거하기

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] link = new int[n+1][2];
		int[] dp = new int[n+1];
		
		StringTokenizer st;
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			link[i][0] = Integer.parseInt(st.nextToken());
			link[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// link(전봇대 연결 상태)배열을 좌측 열 위쪽부터 오름차순으로 정렬
		Arrays.sort(link, new Comparator<int[]>() {
			@Override
			public int compare(int[] t1, int[] t2) {
				return t1[0] - t2[0];
			}
		});
		
		// LIS(Longest Increasing Subsequence) 알고리즘과 해 찾기
		int answer = 1;
		for(int i=1; i<n+1; i++) {
			dp[i] = 1;
			for(int j=1; j<i; j++) {
				if(link[i][1] > link[j][1]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
			answer = Math.max(dp[i], answer);
		}
		
		System.out.println(n - answer);
	}

}
// 풀이 참고: https://hooongs.tistory.com/62
// LIS 설명: https://jins-dev.tistory.com/entry/%EC%B5%9C%EC%A0%81%ED%99%94%EB%90%9C-LISLongest-Increasing-Subsequence-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%EA%B3%BC-%ED%95%B4-%EC%B0%BE%EA%B8%B0
// 2차원 배열 정렬 설명: https://hooongs.tistory.com/63