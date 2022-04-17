package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int caseCount = Integer.parseInt(br.readLine());
		
		for(int i=0; i<caseCount; i++) {
			String[] repeatString = br.readLine().split("");
			int repeatNumber = Integer.parseInt(repeatString[0]);
			int wordLength = repeatString.length - 2;
			for(int j=0; j<wordLength; j++) {
				for(int h=0; h<repeatNumber; h++) {
					bw.write(repeatString[j+2]);
				}
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

}
