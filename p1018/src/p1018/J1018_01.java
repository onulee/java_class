package p1018;

public class J1018_01 {

	public static void main(String[] args) {
		// 구구단 2-9단 2,5만 빼고 출력하시오. continue
		for(int i=2;i<=9;i++) {
			if(i==2 || i==5)
				continue;
			System.out.printf("[ %d단 출력 ]\n",i);
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d \n",i,j,i*j);
			}
		}

	}

}
