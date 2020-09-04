package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_11729 {
	
	static StringBuilder sb = new StringBuilder();
	
	static void move(int from, int to) {
		sb.append(from+" "+to+"\n");
		return;
	}
	
	static void hanoi(int N, int from, int by, int to) {
		if(N==1) {
			move(from, to);
			return;
		}
		else {
			hanoi(N-1, from, to, by); // N-1의 원판이 'from'에서 'to'를 거쳐 'by'를 최종목적지 삼아 이동 
			move(from, to);
			hanoi(N-1, by, from, to); // N-1의 원판이 'by'에서 'from'을 거쳐 'to'를 최종목적지로 이동
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		sb.append((int)(Math.pow(2, N) - 1)).append('\n'); // 총 이동횟수 출력
		hanoi(N, 1, 2, 3);
		System.out.println(sb);
	}
	
}
// 하노이탑 설명: https://ko.wikipedia.org/wiki/%ED%95%98%EB%85%B8%EC%9D%B4%EC%9D%98_%ED%83%91
// 풀이 참고: https://st-lab.tistory.com/96
// 점화식: http://blog.naver.com/PostView.nhn?blogId=a02012u&logNo=50186863280
// static의 의미: https://coding-factory.tistory.com/524