package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1712 {

	public static void main(String[] args) throws IOException {
		// 총 비용 = 고정비용 + 가변비용
		// 총 수입 = 판매 비용
		// 총 수입 > 총 비용이 되는 지점을 손익분기점
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] numbers = br.readLine().split(" ");
		int fixedCost = Integer.parseInt(numbers[0]); // 매년
		int variableCost = Integer.parseInt(numbers[1]); // 노트북 한 대 당 비용
		int income = Integer.parseInt(numbers[2]);
		int breakEvenPoint = 0;
		
		if(income<=variableCost) {
			// System.out.println("income < variableCost");
			breakEvenPoint = -1;
		}
		else {
			breakEvenPoint = fixedCost/(income - variableCost)+1;
		}
		
		System.out.println(breakEvenPoint);
	}

}
