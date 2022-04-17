package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int N = Integer.parseInt(br.readLine());
		String numbers = br.readLine();
		String[] numberList = numbers.split(" ");
		int max = -1000000;
		int min = 1000000;
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(numberList[i]);
			if(num < min) {
				min = num;
			}
			if(num > max) {
				max = num;
			}
		}
		
		bw.write(min+" "+max);
		
		
        bw.flush();
        bw.close();
		
	}

}

