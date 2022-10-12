package p1012;

public class J1012_02 {

	public static void main(String[] args) {
		// 1,3,5,7,9..... 100 넘는 시점의 i,sum
		
		
		
		// 1+2+3+4.... 100을 넘는 시점의 i, sum을 출력하시오.
		int i=0;
		int sum = 0;
		for(i=1;i<=100;i++) {
			if(i%2==1) { //홀수
				if(sum>10) {
					break;
				}
				sum += i;  //sum = sum + i
			}
			
		}
		
		System.out.println("1-100까지의 합에서 100을 넘는 시점의 값 : "+sum);
		System.out.println("100을 넘는 시점 : "+ (i-2));

	}

}
