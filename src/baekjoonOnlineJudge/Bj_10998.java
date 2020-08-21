package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_10998 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] multiple = br.readLine().split(" ");
		int A = Integer.parseInt(multiple[0]);
		int B = Integer.parseInt(multiple[1]);
		System.out.println(A*B);
	}
}
