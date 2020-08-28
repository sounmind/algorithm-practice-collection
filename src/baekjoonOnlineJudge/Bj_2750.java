package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_2750 { // 정렬(버블)

	public static void main(String[] args) throws IOException { // 수 정렬하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i, j, temp, N = Integer.parseInt(br.readLine());
		int[] numbers = new int[N];
		for(i=0; i<N; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		for(i=0; i<N-1; i++) {
			for(j=0; j<N-i-1; j++) {
				if(numbers[j] > numbers[j+1]) {
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		for(i=0; i<N; i++) {
			System.out.println(numbers[i]);
		}
	}

}
