package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_3009 { // 네 번째 점

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] X = new int[1001];
		int[] Y = new int[1001];
		for(int i=0; i<3; i++) {
			X[sc.nextInt()]++;
			Y[sc.nextInt()]++;
		}
		for(int i=0; i<1001; i++) {
			if(X[i]==1)
				System.out.printf("%d ", i);
		}
		for(int i=0; i<1001; i++) {
			if(Y[i]==1)
				System.out.printf("%d", i);
		}
		sc.close();
	}

}
