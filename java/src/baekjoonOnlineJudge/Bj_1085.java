package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_1085 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] numbersStringArray = br.readLine().split(" ");
		int[] numbers = new int[4]; // x, y, w, h
		for (int i = 0; i < 4; i++) {
			numbers[i] = Integer.parseInt(numbersStringArray[i]);
		}
		int rightHorizontal = numbers[2] - numbers[0];
		int leftHorizontal = numbers[0];
		int topVertical = numbers[3] - numbers[1];
		int bottomVertical = numbers[1];
		
		int[] distances = {rightHorizontal, leftHorizontal, topVertical, bottomVertical};
		int min = 1000;
		for (int i = 0; i < 4; i++) {
			if (min >= distances[i]) {
				min = distances[i];
			}
		}
		bw.write(Integer.toString(min));
		bw.flush();
		bw.close();
	}
}
