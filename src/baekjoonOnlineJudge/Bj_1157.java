package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine().toUpperCase();
		int mostRepeatedCount = 0;
		int isSameChar = 0;
		int mostRepeatedIndex = 0;
		
		int[] alphabet = new int[26];
		
		for(int i=0, wordLength = word.length(); i < wordLength; i++) {
			alphabet[(int)word.charAt(i)-65]++;
		}
		for(int i=0; i<26; i++) {
			if(mostRepeatedCount<alphabet[i]) {
				mostRepeatedCount = alphabet[i];
			}
		}
		for(int i=0; i<26; i++) {
			if(mostRepeatedCount==alphabet[i]) {
				isSameChar++;
				mostRepeatedIndex = i;
			}
		}
		if(isSameChar == 1) {
			System.out.print((char)(mostRepeatedIndex+65));
		}else {
			System.out.print("?");
		}
		
	}

}
