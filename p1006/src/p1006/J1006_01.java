package p1006;

public class J1006_01 {

	public static void main(String[] args) {
		// for문 - 2~9단 구구단을 출력하는데, 값이 20 이하만 출력하시오.
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(i*j<=20) 
					System.out.printf("%d * %d = %d \n", i, j, i * j);
				else
					break;
			}
		} // for

		// for문 - 2~9단 구구단을 출력하는데, 2단,4단,6단,8단
//		for(int i=2;i<=9;i++) {
//			if(i%2==0) {
//				for(int j=1;j<=9;j++) {
//					if(j%3==0) {
//						System.out.printf("%d * %d = %d \n",i,j,i*j);
//						
//					}
//				}
//			}
//		}//for

	}

}
