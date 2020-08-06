package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] sentence = br.readLine().split(" ");
		int length = sentence.length;
		int result = length;
		
		if(length != 0 && sentence[0].equals("")) {
			result--;
		}
		
		System.out.println(result);
	}

}
