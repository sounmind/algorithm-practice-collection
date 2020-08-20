package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_10844 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		double[] digit = new double[10];
		digit[0] = 0;
		for(int i=1; i<10; i++) {
			digit[i] = 1;
		}
		
		double[] newDigit = digit.clone();
		
		for(int i=1; i<=N-1; i++) {
			newDigit[0] = digit[1]%1000000000;
			for(int j=1; j<=8; j++) {
				newDigit[j] = (digit[j-1] + digit[j+1])%1000000000;	
			}
			newDigit[9] = digit[8]%1000000000;
			digit = newDigit.clone();
		}
		
		for(int i=0; i<10; i++) {
			System.out.print(newDigit[i]+" ");
		}
		System.out.println();
		
		double sum = 0;
		for(int i=0; i<10; i++) {
			sum = sum + newDigit[i]%1000000000;
		}
		bw.write(Integer.toString((int)sum%1000000000));
		bw.flush();
		bw.close();
	}
}
