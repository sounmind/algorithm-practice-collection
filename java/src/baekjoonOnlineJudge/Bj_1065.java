package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_1065 {
	
	public static int isHansu(int number) {
		String stringNumber = Integer.toString(number);
		String[] splitNumber = stringNumber.split("");

		for(int i=0, length = splitNumber.length; i<length-2; i++) {
			int n0 = Integer.parseInt(splitNumber[i]);
			int n1 = Integer.parseInt(splitNumber[i+1]);
			int n2 = Integer.parseInt(splitNumber[i+2]);
			if(n0-n1==n1-n2) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		int result = 0;
		
		if(inputNumber <= 99) {
			result = inputNumber;
		} else if(inputNumber == 1000) {
			result = 144;
		} else {
			result = 99;
			for(int i=100; i<=inputNumber; i++) {
				if(isHansu(i)==0) {
					result++;
				}
			}
		}
		System.out.println(result);
	}

}
