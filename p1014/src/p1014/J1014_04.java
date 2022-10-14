package p1014;

public class J1014_04 {
	public static void main(String[] args) {
		// 구구단 출력하시오.
		// 5단빼고 출력하시오.
		for(int i=2;i<=9;i++) {
			
			if(5<=i && i<=8) //2,3,4,9     5와 8사이
				continue;
			
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d \n",i,j,i*j);  // %s, %d, %f -> %5.1f, \t, \n
			}
		}
		
		
		
		
		
	}

}
