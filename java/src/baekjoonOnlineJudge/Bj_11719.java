package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Bj_11719 {

	public static void main(String[] args) throws IOException {
		String str = "";
		// 버퍼 이용하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while((str = br.readLine()) != null) {
        	bw.write(str);
        	bw.newLine();
        	bw.flush();
        }
		br.close(); bw.close();

		// Scanner 이용하기
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNextLine()) {
//			str = sc.nextLine();
//			System.out.println(str);
//		}
//		sc.close();
	}
// 풀이 출처: https://jhnyang.tistory.com/128
}
