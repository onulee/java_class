package p1006;

public class J1006_05 {

	public static void main(String[] args) {
		name1:
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j==5)
					break name1;
				System.out.printf("%d * %d = %d \n",i,j,i*j);
			}
		}
		
		// 구구단 출력하는데 2~9단출력      2*1=2 2*3=6 2*5=10.... 3*1=2 3*3=6
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(j%2==0)
//					continue;
//				System.out.printf("%d * %d = %d \n",i,j,i*j);
//			}
//		}
		
		
		
		
//		for(int i=1;i<=10;i++) {
//			if(i%3==0) {
//				continue;
////				break;
//			}
//			System.out.println(i);
//		}

	}

}
