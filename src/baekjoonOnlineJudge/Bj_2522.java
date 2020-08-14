package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_2522 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=input; i++) {
			for(int j=1; j<=input-i; j++) {
				sb.append(" ");
			}
			for(int j=1; j<=i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		for(int i=input-1; i>=1; i--) {
			for(int j=1; j<=input-i; j++) {
				sb.append(" ");
			}
			for(int j=1; j<=i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}
