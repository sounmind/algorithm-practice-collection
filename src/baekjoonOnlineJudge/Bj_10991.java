package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_10991 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=input; i++) {
			for(int j=1; j<=input-i; j++) {
				sb.append(" ");
			}
			for(int j=1; j<=(2*i)-1; j++) {
				if(j%2==1) {
					sb.append("*");
				} else {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
		// 풀이 출처: https://www.acmicpc.net/user/myoung120
	}
}

//이전 풀이
//for(int i=1; i<=input; i++) {		
//	if(i%2==1) {
//		for(int j=input-2; j>=i; j--) {
//			sb.append(" ");
//		}
//		for(int j=1; j<=i; j++) {
//			if(input==i && j==1) {
//				sb.append("*");
//				continue;
//			}
//			sb.append(" *");
//		}
//	} else { // 짝수 줄
//		for(int j=input-1; j>=i; j--) {
//			sb.append(" ");
//		}
//		sb.append("*");
//		for(int j=1; j<=i-1; j++) {
//			sb.append(" *");
//		}
//	}
//	sb.append("\n");
//}
