package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int[] numberList = new int[9]; 
		int max = 0;
		int maxLocation = 0;
		
		for(int i=0; i<9; i++) {
			numberList[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<9; i++) {
			if(max < numberList[i]) {
				max = numberList[i];
				maxLocation = i+1;
			}
		}
		
		
		
		
		System.out.println(max);
		System.out.println(maxLocation);
	}

}
