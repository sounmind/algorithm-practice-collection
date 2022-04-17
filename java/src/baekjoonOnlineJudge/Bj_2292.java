package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count = 0;
		int sum = 1;
		
		if(input==1) {
			count++;
			System.out.println(count);
			return;
		}
		
		for(int i=0; i<input; i++) {
			
			sum += 6*i;
			count += 1;
			
			if(sum>=input) {
				break;
			}	
		}
		
		System.out.println(count);
	}

}
