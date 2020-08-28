package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] numbers = br.readLine().split(" ");
		int primeNumber = 0;
		for(int i=0; i<N; i++) {
			int number = Integer.parseInt(numbers[i]);
			int count = 0;
			for(int j=1; j<=number; j++) {
				if(number % j == 0) {
					count++;
				}
			}
			if(count==2) {
				primeNumber++;
			}
		}
		System.out.println(primeNumber);
	}

}
