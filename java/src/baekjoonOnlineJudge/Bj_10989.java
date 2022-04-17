package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i,N = Integer.parseInt(br.readLine());
		int[] checker = new int[10001];
		for(i=0; i<N; i++)
			checker[Integer.parseInt(br.readLine())]++;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(i=0; i<10001; i++)
			if(checker[i]>0)
				while(checker[i]-- != 0)
					bw.write(Integer.toString(i)+"\n");
		bw.flush();
		br.close();
		bw.close();
	}

}

// 풀이 참고: https://zoonvivor.tistory.com/43