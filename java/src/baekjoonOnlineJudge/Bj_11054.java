package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_11054 { // 가장 긴 바이토닉 부분 수열
	
	public static int[] reverse(int[] array) { // 배열 요소 뒤집어서 저장하기
		for(int i = 1, len = array.length-1, end = len; i <= len/2; i++) { 
			int temp = array[i];
			array[i] = array[end];
			array[end--] = temp;
		}
		return array;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j, max;
		int numbers[] = new int[n+1], ascend[] = new int[n+1], descend[] = new int[n+1];
		for(i = 1; i <= n; i++) {
			numbers[i] = sc.nextInt();
		}
		// 가장 긴 증가 부분 수열 찾는 배열을 ascend에 입력
		for(i = 1; i <= n; i++){ 
			ascend[i] = 1;
			for(j = 1; j <= i; j++) {
				if(numbers[j] < numbers[i] && ascend[i] <= ascend[j] ) {
					ascend[i] = ascend[j] + 1;
				}
			}
		}
		reverse(numbers);
		// numbers를 뒤집고 가장 긴 증가 부분 수열 찾는 배열을 descend에 입력 (이후 descend 뒤집기)
		for(i = 1; i <= n; i++){ 
			descend[i] = 1;
			for(j = 1; j <= i; j++) {
				if(numbers[j] < numbers[i] && descend[i] <= descend[j] ) {
					descend[i] = descend[j] + 1;
				}
			}
		}
		reverse(descend);
		max = 0;
		for(i=0; i <= n; i++) {
			if(ascend[i]+descend[i] > max)
				max = ascend[i]+descend[i];
		}
		System.out.println(max-1);
		sc.close();
	}

}
