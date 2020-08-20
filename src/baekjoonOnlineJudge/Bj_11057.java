package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_11057 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		
		int[] digit = new int[10];
		for(int i=0; i<10; i++) {
			digit[i] = 1;
		}
		for(int i=1; i<N; i++) {
			int[] newDigit = new int[10];
			for(int j=0; j<10; j++) {
				for(int k=0; k<=j; k++) {
					newDigit[j] = (newDigit[j]+digit[k])%10007;
				}
			}
			digit = newDigit.clone();
		}
		
		int sum = 0;
		for(int i=0; i<10; i++) {
			System.out.print(digit[i]+" ");
			sum = (sum + digit[i])%10007;
		}
		System.out.println();
		bw.write(Integer.toString(sum%10007));
		bw.flush();
		bw.close();
	}
}
// 풀이 참고: https://fbtmdwhd33.tistory.com/74