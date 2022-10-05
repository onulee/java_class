package p1005;

public class J1005_02 {

	public static void main(String[] args) {
		// 구구단 5단까지 출력하시오.
		for(int i=2;i<=9;i++) {
			System.out.printf(" [ %d 단 ] \t",i);
		}
		System.out.println();
		for(int i=1;i<=9;i++) {
//			System.out.printf("[ %d 단 ]\t",i);
			for(int j=2;j<=9;j++) {
				System.out.printf("%d * %d = %d \t ",j,i,i*j);
			}
			System.out.println();
		}

	}

}
