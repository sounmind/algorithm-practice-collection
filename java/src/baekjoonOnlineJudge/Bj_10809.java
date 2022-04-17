package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		String[] word = br.readLine().split("");
		int wordLength = word.length;
		String[] alphabet = new String[26];
		// a=97 ~ z=122
	
		for(int i=0; i<26; i++) {
			alphabet[i] = "-1";
		}
		for(int i=0; i<wordLength; i++) {
			String alphabetIndex = alphabet[(int)word[i].charAt(0)-97];
			if(alphabetIndex.equals("-1")) {
				alphabet[(int)word[i].charAt(0)-97] = Integer.toString(i);
			}
		}
		
		for(int i=0; i<26; i++) {
			bw.write(alphabet[i]+" ");
		}
		bw.flush();
		bw.close();
	}
}
