package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_1931 { // 정수 삼각형
	// 전역 변수 선언
	static int height; // 높이
	static int[][] arr; // 삼각형 배열
	static Integer[][] dp; // 정답(최댓값이 상단꼭짓점에 입력되는) 배열
	// dp에 객체배열을 쓰면 int배열 보다 4배의 메모리가 소모된다. 하지만 int배열이 0으로 초기화되는 대신 객체배열은 null로 초기화된다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		height = Integer.parseInt(br.readLine());
		arr = new int[height][height];
		dp = new Integer[height][height];
		StringTokenizer st;
		// 삼각형 값 입력
		for(int i=0; i<height; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<=i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}	
		}
		// 삼각형의 가장 하단 값을 정답 배열로 복사하기
		for(int i=0; i<height; i++)
			dp[height-1][i] = arr[height-1][i];
		
		System.out.println(getMaxVertex(0, 0));
	}
	
	static int getMaxVertex(int row, int column) {
		
		if(row == height - 1)
			return dp[row][column];
		
//		int leftMax = getMaxVertex(row+1, column),
//			rightMax = getMaxVertex(row+1, column+1); // 이렇게 하면 시간초과
		
		if(dp[row][column] == null) // 정답 배열에 값이 없다면,
//			dp[row][column] = Math.max(leftMax, rightMax) + arr[row][column]; // 이렇게 하면 시간초과
			dp[row][column] = Math.max(getMaxVertex(row+1, column), getMaxVertex(row+1, column+1)) + arr[row][column];
		
		return dp[row][column];
	}

}
// 풀이 참고: https://st-lab.tistory.com/131
