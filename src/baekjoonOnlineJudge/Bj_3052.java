package baekjoonOnlineJudge;

import java.util.Scanner;
import java.util.Arrays;

public class Bj_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int remainderList[] = new int[10];
		int independentNumberCount = 10;
		
		for(int i=0; i<10; i++) {
			remainderList[i] = sc.nextInt() % 42;
		}
		
		Arrays.sort(remainderList);
		
		for(int i=0; i<9; i++) {
			if(remainderList[i]==remainderList[i+1]) {
				independentNumberCount--;
			}
		}
		System.out.println(independentNumberCount);

	}

}
