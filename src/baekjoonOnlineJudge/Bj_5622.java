package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_5622 {

	public static void main(String[] args) throws IOException {
		String[] numberToAlphabetCount = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"}; // 0~9까지 들어있는 알파벳 개수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputCode = br.readLine().split("");
		int time = 0;
		for(int i=0; i<10; i++) {
			for(int j=0, wordLen = inputCode.length; j<wordLen; j++) {
				if(numberToAlphabetCount[i].contains(inputCode[j])) {
					time += i+1;
				}
			}
		}
		System.out.println(time);
		
		
	}

}
