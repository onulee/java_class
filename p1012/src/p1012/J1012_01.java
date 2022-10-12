package p1012;

public class J1012_01 {
	public static void main(String[] args) {
		
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
//				System.out.println(i+" * "+j+" = "+i*j);
				System.out.printf("%d * %d = %d \n",i,j,i*j);  // %s, %d, %f -> %5.1f, \t, \n
			}
		}
		
		//무한반복
		for(int i=1;i<=100;i++) {
			System.out.println("1");
		}
		
		int i=1;
		while(i<=100) {
			System.out.println("1");
			i++;
		}
		
		
		
//		for(int i=1;i<=100;i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		
		
		// 입력이
		// 1,7 -> SK 출력
		// 6 -> KT
		// 9 -> LG 출력될수 있게 프로그램 구성하시오.
		//if,switch
		
		
	}//main

}//class
