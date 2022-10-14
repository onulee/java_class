package p1014;

public class J1014_01 {

	public static void main(String[] args) {
		// 배열 100개를 만들어서 1-100까지 숫자를 넣으시오.
		// 1. 배열 100개
		// 2. 숫자를 넣음. 1-100
		
		int[] num = new int[100];
		
		for(int i=0;i<100;i++) {
			if(i%2==0) {
				continue;
			}
			num[i] = i;   // 홀수만 넣으시오.
		}
		
		for(int i=1;i<=100;i+=2) {
			System.out.println(num[i]);  //1,3,5 2n+1
		}
		
		
		
		

	}

}
