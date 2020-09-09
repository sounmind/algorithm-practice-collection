package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_11399 {

	public static void main(String[] args) throws IOException { // ATM
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] numbers = new int[1001];
		int[] sorted = new int[N];
		for(int i=0; i<N; i++) {
			numbers[Integer.parseInt(st.nextToken())]++;
		}
		for(int i=0, j=0; i<1001; i++) {
			if(numbers[i]!=0) {
				while(numbers[i]-- != 0) {
					sorted[j++] = i;
				}
			}
		}
		int sum = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<=i; j++) {
				sum += sorted[j];
			}
		}
		System.out.println(sum);
	}

}
