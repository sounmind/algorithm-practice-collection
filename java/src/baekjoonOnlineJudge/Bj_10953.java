package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_10953 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int caseCount = Integer.parseInt(br.readLine());
		for(int i=0; i<caseCount; i++) {
        	String[] numbers = br.readLine().split(",");
        	bw.write(Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1])+"\n");
		}
		bw.flush();
		bw.close();
	}

}
