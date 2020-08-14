package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_11721 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String word = br.readLine();
		br.close();
		// System.out.println(word.length()+"글자입니다.");
		int wordLength = word.length();
		
		for(int i=0; i < wordLength; i+=10) {
			if(i+10 > wordLength) {
				bw.write(word.substring(i));
				break;
			}
			bw.write(word.substring(i, i+10));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
