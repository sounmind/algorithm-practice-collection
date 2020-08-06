package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] twoNum = br.readLine().split(" ");
		StringBuilder sb1 = new StringBuilder();
		sb1.append(twoNum[0].charAt(2));
		sb1.append(twoNum[0].charAt(1));
		sb1.append(twoNum[0].charAt(0));
		StringBuilder sb2 = new StringBuilder();
		sb2.append(twoNum[1].charAt(2));
		sb2.append(twoNum[1].charAt(1));
		sb2.append(twoNum[1].charAt(0));
		if(Integer.parseInt(sb1.toString()) >= Integer.parseInt(sb2.toString())) {
			System.out.println(Integer.parseInt(sb1.toString()));
		}else {
			System.out.println(Integer.parseInt(sb2.toString()));	
		}
	}

}
