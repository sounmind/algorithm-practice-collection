package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Bj_2751 { //정렬(내장 정렬: 퀵소트)

	public static void main(String[] args) throws IOException { // 수 정렬하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int i, N = Integer.parseInt(br.readLine());
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(i=0; i<N; i++) {
			numbers.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(numbers);
		for(i=0; i<N; i++) {
			bw.write(Integer.toString(numbers.get(i)));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	
}
