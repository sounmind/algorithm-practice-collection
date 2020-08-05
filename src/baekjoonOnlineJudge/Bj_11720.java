package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int number = Integer.parseInt(br.readLine());
		int sum = 0;
		String[] numToString = br.readLine().split("");
		for(int i=0; i<number; i++) {
			sum += Integer.parseInt(numToString[i]);
		}
		bw.write(Integer.toString(sum));
		
		bw.flush();
		bw.close();
	}

}
