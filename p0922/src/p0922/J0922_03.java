package p0922;

public class J0922_03 {
	
	public static void main(String[] args) {
		long num = 1000;
		long num2 = 10000000000L; //21억 이상의 숫자는 접미사 L를 붙임
		float f = 3.14f;  // float은 접미사 f,F를 붙여야 함.
		double d = 3.14;  // 접미사 d를 생략가능
//		10. -> double
//		.10  -> double
//		10f  -> 10.0f
		float ff = 10;
		System.out.println(ff);
//		3.14e3f -> 3140.0f float
//		1e1 -> 1*10= 10.0 double
		
		float fff=0;
		System.out.println(fff);
		
		fff=2;
		fff=3;
		fff=4;
		
		

	}

}
