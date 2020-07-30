package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		String inputNX = br.readLine();
		String[] arrNX = inputNX.split(" ");
		
		int N = Integer.parseInt(arrNX[0]);
		int X = Integer.parseInt(arrNX[1]);
		
		String inputNumber = br.readLine();
		String[] arrNumber = inputNumber.split(" ");
		
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(arrNumber[i]);
			if(num < X) {
				bw.write(num+" ");
			}
		 }
			
		bw.flush(); 
		bw.close(); 
	}
}