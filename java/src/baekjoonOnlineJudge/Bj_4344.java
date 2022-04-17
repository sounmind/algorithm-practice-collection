package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int testCaseCount = Integer.parseInt(br.readLine());
		
		String[] testCase = new String[testCaseCount];
		
		for(int i=0; i<testCaseCount; i++) {
			testCase[i] = br.readLine();
			String[] studentCountAndScore = testCase[i].split(" ");
			
			int studentCount = Integer.parseInt(studentCountAndScore[0]);
			int sumOfScore = 0;
			int aboveMeanScoreStudentCount = 0;
			for(int j=1; j<=studentCount; j++) { // 평균 구하기
				sumOfScore+=Integer.parseInt(studentCountAndScore[j]);
			}
			for(int j=1; j<=studentCount; j++) { // 평균을 넘는 학생 비율 구하기 (소수점 셋째 자리까지 출력)
				if(Integer.parseInt(studentCountAndScore[j]) > (float)sumOfScore/studentCount) {
					aboveMeanScoreStudentCount++;
				}
			}
			bw.write(String.format("%.3f", (float)aboveMeanScoreStudentCount/studentCount*100)+"%\n");
		}
		bw.flush();
		bw.close();
	}
}
