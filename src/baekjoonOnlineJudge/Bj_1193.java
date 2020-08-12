package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int numerator, denominator;
		
		int line = 0; // line번째 대각선
		int count = 0;
		
		while(count < input) { // 몇 번째 대각선인지 알아내는 반복문
			line++;
			count = line*(line+1)/2;
		}
		
		System.out.println("count="+count+" input="+input);
		
		if(line%2 != 0) { // 홀수 번째 대각선
			numerator 	= 1 	+ (count - input);
			denominator = line 	- (count - input);
		} else { // 짝수 번째 대각선
			numerator 	= line 	- (count - input);
			denominator = 1 	+ (count - input);
		}
		
		System.out.println(numerator+"/"+denominator);
	}
}
// 풀이 출처: https://hongku.tistory.com/246
