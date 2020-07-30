package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int quizCount = Integer.parseInt(br.readLine());
        
        String[] oneOXListContainer = new String[quizCount];
        
        for(int i=0; i<quizCount; i++) {
        	int score = 0;
        	oneOXListContainer = br.readLine().split("X");
        	int lengthOfOXContainer = oneOXListContainer.length;
            
        	for(int j=0; j<lengthOfOXContainer; j++) {
        		int continuousOCount = oneOXListContainer[j].length();
        		for(int h=1; h<=continuousOCount; h++) {
        			score+=h;
        		}
        	}
        	bw.write(score+"\n");
        }
        bw.flush();
        bw.close();
	}
}

