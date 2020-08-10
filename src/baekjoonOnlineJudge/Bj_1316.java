package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1316 {
	// 다른 알파벳이 나오면 그 알파벳을 -1로 바꾸자.
	
	public static int isGroupWord(String word) {
		int[] alphabet;
		alphabet = new int[26];
		for(int i=0, len=word.length(); i<len; i++) {
			int alpha = alphabet[word.charAt(i)-97];
			if(alpha==0) {
				// System.out.println("새로운 알파벳이다!");
				alpha=1;
			}
			if(alpha==1) {
				// System.out.println("기존에 있던 거다!");
				if(i>0 && word.charAt(i-1)!=word.charAt(i)) {
					// System.out.println("넌 이제 다시 나오면 안된다?");
					alphabet[word.charAt(i-1)-97] = -1;
				}
			}
			if(alpha==-1) {
				// System.out.println("다시 나와버렸다!! no group word");
				return 1;
			}			
		}
		return 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int wordCount = Integer.parseInt(br.readLine());
		int groupWordChecker = 0;
		
		String[] word = new String[wordCount];
		
		for(int i=0; i<wordCount; i++) {
			word[i] = br.readLine();
			if(isGroupWord(word[i])==0) {
				groupWordChecker++;
			}
		}
		System.out.println(groupWordChecker);
	}

}
