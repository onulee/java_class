package p0923;

public class J0923_05 {

	public static void main(String[] args) {
//		System.out.println(10.0/3);
		int year = 2022;
		double pi = 3.14;
		String area = "서울";
		//printf 정수 - %d, 실수 - %f, 문자열 - %s, 문자 = %c
//		System.out.printf("사는도시 : %s, 년도 :%d, 파이값 : %f ",area,year,pi);
		
		String stuClass = "자바웹프로그래밍";
		int member = 9;
		double rate = 95.8888;
		double rate2 = 1.0123456789;
		double rate3 = 50.1;
		float rate4 = 1.0123456789F;
		
		// printf
		// 과정 : 자바 웹프로그래밍, 인원:9명, 참석율:95.8% 출력하시오.
		System.out.printf("과정 : %s, 인원:%d명, 참석율:%.2f %% %n", stuClass,member,rate);
		System.out.printf("[%10s] %n", stuClass);
		System.out.printf("[1234567890]%n");
		System.out.printf("[%7.1f] %n", rate3); //7:총자리, 1:소수점이하 출력, 오른쪽정렬
		System.out.printf("[%-7.1f] %n", rate3);  //왼쪽정렬
		System.out.println(rate4);
		System.out.println(rate2);
		

	}

}
