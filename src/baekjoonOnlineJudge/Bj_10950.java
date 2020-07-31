package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_10950 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
    	int testNum = scan.nextInt();
    	int count = 0;
    	
    	while(count<testNum) {
    		System.out.println(scan.nextInt() + scan.nextInt());
    		count++;
    	}

	}
}
