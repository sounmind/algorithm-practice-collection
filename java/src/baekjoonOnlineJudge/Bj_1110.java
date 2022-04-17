package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_1110 {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String char0;
        String char1;
        int int0;
        int int1;
        int sumEach = 0;
        String newDigit = str;
        int count = 0;
        
        do{
        	if(newDigit.length()==1) { // 첫 입력 값이 한 자리일 떄
            	newDigit = "0".concat(newDigit);
            }
        	
            char0 = Character.toString(newDigit.charAt(0));
            char1 = Character.toString(newDigit.charAt(1));
            int0 = Integer.parseInt(char0);
            int1 = Integer.parseInt(char1);
            
            sumEach = int0 + int1;
            
            if(sumEach<10 && int1==0) { // '3''0' -> '3'
            	newDigit = char0;
            }
            else if(sumEach >= 10) { // '3''9' -> '9''2'
            	newDigit = char1.concat(Integer.toString(sumEach % 10));
            }
            else { // '3''1' -> '1''4'
            	newDigit = char1.concat(Integer.toString(sumEach));
            }
            count++;
            // System.out.println("newDigit= "+newDigit+" count= "+count);
        }while(!str.equals(newDigit));
        
        System.out.print(count);
	}
}