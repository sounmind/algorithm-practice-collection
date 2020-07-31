package baekjoonOnlineJudge;

public class Bj_15596 {
	
	public static long sum(int[] a) {
		long sumOfArray = 0;
		long lengthOfArray = a.length;
		
		for(int i=0; i<lengthOfArray; i++) {
			sumOfArray += a[i];
		}
		
		return sumOfArray;
	}

	public static void main(String[] args) {
		
	}
}

/* 백준 온라인 저지에 제출한 것 (형식이 이미 지정되어 있었다)

public class Test {
    long sum(int[] a) {
        long ans = 0;
        long lengthOfArray = a.length;
        
        	for(int i=0; i<lengthOfArray; i++) {
			ans += a[i];
		}
        return ans;
    }
}

*/
