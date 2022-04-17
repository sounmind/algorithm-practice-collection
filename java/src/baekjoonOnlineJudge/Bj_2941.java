package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Bj_2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] croAlpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String[] word = br.readLine().split("");
		
		int croWordCount = 0;
		int wordLength=word.length;
		int totalLetterCount = wordLength;
		List<String> croAlphaList = Arrays.asList(croAlpha);

		for(int i=0 ; i<wordLength-1; i++) {
			String twoLetter = word[i].concat(word[i+1]);
			if(croAlphaList.contains(twoLetter)) {
				croWordCount += 1;
				totalLetterCount -= 2;
			}
		}
		for(int i=0; i<wordLength-2; i++) {
			String threeLetter = word[i].concat(word[i+1]).concat(word[i+2]);
			if(croAlphaList.contains(threeLetter)) {
				croWordCount += 0;
				totalLetterCount -= 1;
			}
		}
		System.out.println(croWordCount + totalLetterCount);
	}

}
