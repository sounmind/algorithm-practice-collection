package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1008 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] divide = br.readLine().split(" ");
		double A = Integer.parseInt(divide[0]);
		double B = Integer.parseInt(divide[1]);
		System.out.println(A/B);
	}

}
