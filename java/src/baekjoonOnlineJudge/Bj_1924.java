package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_1924 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int monthInput = sc.nextInt();
		int date = sc.nextInt();
		
		// 각 달의 1일의 요일만 알면 풀 수 있다. -> 너무 일일이 입력한다. 좀 더 계산적으로 푸는 방법은?
		// 현재 날짜에서 계속 7일씩 뺸다.
		// 현재 날짜까지 모든 '일' 수를 계산한 다음 7로 나눠도 된다.
		
		while(true) {
			if(monthInput==1) {
				System.out.println(day[date%7]);
				break;
			}
			if(date <= 7) {
				date += month[monthInput-2];
				monthInput--;
			}
			date -= 7;
		}
		
	}

}
