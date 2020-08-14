package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_2441 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<input; i++) {
			for(int j=0; j<i; j++) {
				sb.append(" ");
			}
			for(int j=i; j<input; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}
