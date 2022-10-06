package p1006;

public class J1006_04 {

	public static void main(String[] args) {
		// 1부터 1000까지의 합을 구하는데, 2000넘는 시점과 그 이전 시점을 구하시오.
		int i=0,sum=0;
		while(true) {
			if(sum>2000)
				break;
			else
				i++;
				sum = sum + i;
		}
		
		System.out.println("2000을 넘는 수 : "+i);
		System.out.println("2000을 값 : "+sum);
		System.out.println("2000을 넘는 수 : "+(i-1));
		System.out.println("2000을 값 : "+(sum-i));
		
		
		
		
		
		
		
		
//		// 1부터 100까지의 합을 구하는데, 합이 100넘는 시점을 출력하시오.
//		int i=0,sum=0;
//		while(true) {
//			if(sum>2000)
//				break;
//			else
//				i++;
//				sum = sum + i;
//		}
//		
//		System.out.println("2000을 넘는 수 : "+i);
//		System.out.println("2000을 값 : "+sum);
//		

	}

}
