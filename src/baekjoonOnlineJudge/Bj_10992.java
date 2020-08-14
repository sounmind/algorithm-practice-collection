package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_10992 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=input; i++) {
			for(int j=1; j<=input-i; j++) {
				sb.append(" ");
			}
			
			for(int j=1; j<=(2*i)-1; j++) {
				if(j==1) {
					sb.append("*");
				} else if(j==(2*i)-1) {
					sb.append("*");
				}
				else {
					if(i==input) {
						sb.append("*");
					} else {
						sb.append(" ");
					}
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}
