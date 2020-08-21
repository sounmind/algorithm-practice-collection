package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1001 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] minus = br.readLine().split(" ");
		System.out.println(Integer.parseInt(minus[0])-Integer.parseInt(minus[1]));
	}
}
