package p0923;

public class J0923_01 {

	public static void main(String[] args) {
		int a = 1000000;
		int b = 1000000;
		double c = (double)a * b;
		System.out.println(c);
		System.out.println((double)a*b);
		
		int num = 2147483647;
		System.out.println(num+5);
		
		float f = 10.0f;
		// float int
		// 문자형<정수형<실수형<문자열
		f = a;       // 자동으로 형변환 됨.
		a = (int)f;  // 강제로 형변환을 해야 함.
		
		char ch1 = 'A';
		System.out.println((int)ch1);
		
		int ch2 = 67;
		System.out.println((char)ch2);
		

	}

}
