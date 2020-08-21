package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ABV = br.readLine().split(" ");
		int move = Integer.parseInt(ABV[0]); // 낮에 이동
		int moveBack = Integer.parseInt(ABV[1]); // 밤에 뒤로 이동
		int distance = Integer.parseInt(ABV[2]); // 가야하는 거리
		int residue = (distance - moveBack) % (move - moveBack);
		int quotient = (distance - moveBack) / (move - moveBack);
		int date = residue == 0 ? quotient : quotient + 1;
		System.out.println(date);
	}
}

// 풀이 참고: https://st-lab.tistory.com/75