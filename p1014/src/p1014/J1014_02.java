package p1014;

public class J1014_02 {

	public static void main(String[] args) {
		// 배열 100개를 만들어서, 1-100까지 입력하세요.
		
		int[] num = new int[100];
		int[] num2 = new int[100];
		
		for(int i=0;i<100;i++) { // 1,2,3,4,5....
			num[i] = i+1;
		}
		
		// 배열 100개를 만들어서, 1,3,5,7,9.. 자동으로 들어가게 하세요.
		for(int i=0;i<100;i++) {
			num2[i] = 2*i+1; //2n+1 1,3,
		}

	}

}
