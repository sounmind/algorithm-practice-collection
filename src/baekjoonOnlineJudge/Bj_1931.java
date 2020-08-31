package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_1931 {
	
	public static int triangle(int[][] arr, int height, int row, int column) {
		int topValue = arr[row][column];
		// System.out.printf("topvalue=%d, height=%d, row=%d, column=%d\n", topValue, height, row, column);
		if(height==1) {
			return topValue;
		}
		int leftMax = triangle(arr, height-1, row+1, column);
		int rightMax = triangle(arr, height-1, row+1, column+1);
		return topValue + Math.max(leftMax, rightMax);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		
		int[][] arr = new int[height][height];
		
		for(int i=0; i<height; i++) {
			for(int j=0; j<=i; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(triangle(arr, height, 0, 0));
		sc.close();
	}

}
