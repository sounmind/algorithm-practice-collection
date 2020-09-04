package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_15649 { // N과 M(1)
	
	static int N, M; // N까지의 자연수에서 크기가 M인 수열을 모두 구하라
	static int numbers[], isCheck[];
	
	static void printNumbers() {
		StringBuilder sb = new StringBuilder(); 
		for(int i=1; i<=M; i++)
			sb.append(numbers[i]+" ");
		System.out.println(sb);
	}
	
	static void dfs(int index) {
		if(index == M+1) {
			printNumbers();
		} else {
			for(int i=1; i<=N; i++) { 	// (N까지의 자연수) N번 반복
				if(isCheck[i]==1)
					continue;
				else {
					isCheck[i] = 1;
					numbers[index] = i;
					dfs(index+1); 		// index를 증가시켜, M+1이 될 때까지 반복
					isCheck[i] = 0;		
					// dfs가 리턴(출력)이 된 뒤, i번째 isCheck이 '0'이 되면서, 
					// 다음 dfs(index)에서 numbers[index]에 i가 들어가지 않게 된다.
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		isCheck = new int[N+1];
		numbers = new int[N+1];
		dfs(1);
	}

}
// 풀이 참고: https://fbtmdwhd33.tistory.com/36
// StringTokenizer: https://m.blog.naver.com/pgh7092/221080752099
// 깊이 우선 탐색: https://ko.wikipedia.org/wiki/%EA%B9%8A%EC%9D%B4_%EC%9A%B0%EC%84%A0_%ED%83%90%EC%83%89