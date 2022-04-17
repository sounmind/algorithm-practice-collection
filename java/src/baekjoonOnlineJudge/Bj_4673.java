package baekjoonOnlineJudge;

public class Bj_4673 {

	public static boolean[] hasGenerator = new boolean[10036];
	
	public static int selfSum(int n) {
		int sum = 0;
		String[] arrayN = Integer.toString(n).split("");
		
		for(int i=0; i<arrayN.length; i++) {
			sum += Integer.parseInt(arrayN[i]);
		}
		
		sum += n;
		hasGenerator[sum] = true;
		return sum;
	}

	public static void main(String[] args) {
		for(int i=1; i<10000; i++) {
			selfSum(i);
		}
		
		for(int i=1; i<10000; i++) {
			if(hasGenerator[i]==false) {
				System.out.println(i);
			}
		}
	}

}
