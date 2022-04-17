package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1546 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(br.readLine());
        String[] testScoreList = br.readLine().split(" ");
        float meanOfNewScores = 0;
        int maxScore = 0;
        
        for(int i=0; i<testCount; i++) {
        	if(maxScore <= Integer.parseInt(testScoreList[i])) {
        		maxScore = Integer.parseInt(testScoreList[i]);
        	}
        }
        for(int i=0; i<testCount; i++) {
        	meanOfNewScores += (float)(Integer.parseInt(testScoreList[i]))/maxScore*100/testCount;
        }
        System.out.print(meanOfNewScores);
	}

}

