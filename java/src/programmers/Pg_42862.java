package programmers;
import java.util.*;
/*
 * 문제: 번호 차이가 1인 학생에게 여분의 체육복이 있는 학생들이 체육복을 빌려줄 수 있을 때, 체육복을 가질 수 있는 학생의 최댓값은?
 * 2 <= 전체 학생의 수 <= 30
 * 여벌 체육복 가진 학생만 다른 학생에게 체육복을 빌려줄 수 있다
 * 여벌 체육복을 가진 학생도 체육복을 도난당할 수 있다. 이때 이 학생은 체육복이 한 벌 있다고 간주, 다른 학생에게 체육복을 빌려줄 수 없다.
 * n: 전체 학생, lost: 도난당한 학생목록, spare: 여벌 체육복 가져온 학생목록
 */

public class Pg_42862 { // 체육복 | https://programmers.co.kr/learn/courses/30/lessons/42862
    static int solution(int n, int[] lost, int[] spare) {
    	
    	int lostLen = lost.length, spareLen = spare.length;
    	int answer = n - lostLen; // 정답을 전체 학생 수에서 체육복 잃어버린 사람 수를 빼서 초기화
        Arrays.sort(lost); Arrays.sort(spare);
    	
       
        
        
        // 여벌-도난 모두 해당하는 학생을 배열에서 예외로 처리 -> 일반 학생 취급
        int spareAndLost = 0;
        for(int i = 0; i < lostLen; i++){
            for(int j = 0; j < spareLen; j++){
                if(lost[i] == spare[j]){ // 여벌 학생이 동시에 도난 학생인 경우
                    lost[i] = -100;
                    spare[j] = -100;
                    spareAndLost++;
                }
            }
        }
        
        // 양 옆에 도난 또는 여벌 학생 있는 경우
        for(int i = 0; i < lostLen; i++) {
            for(int j = 0; j < spareLen; j++) {
                if(i > 0 && lost[i] - lost[i-1] == 2 && spare[j] == lost[i] - 1)
                	continue; // 여벌 학생 양 옆에 도난 학생 있을 경우, 한 명만 줘야 하기 때문에 continue
                if(Math.abs(lost[i] - spare[j]) == 1) { // 도난 학생 양 옆 중 한 명이 여벌 학생일 경우
                    answer++; // 도난 학생이 여벌 체육복을 받았다!
                	break; // 다음 도난 학생으로 넘어감
                }
            }   
        }
        return answer + spareAndLost;
    }

	public static void main(String[] args) {
		
		int n = 5;
		int[] lost = {2, 4};
		int[] spare = {3, 5};
		
		System.out.println(solution(n, lost, spare));

	}

}
