package p0922;

public class J0922_05 {

	public static void main(String[] args) {
		byte b = 127;
//		byte b2 = 128;
//		b = b + 1;
		b = (byte)(b + 1); //128 강제형변환
		System.out.println(b);  //-128 ~ 127
		int a = 2147483647;
		System.out.println(a+1);
		float f = 1.6f;
		double d = f;
		int num = (int)f;
		System.out.println(num);
		
		char ch = 'A';
		int n = 97;
		System.out.println((char)n);
		System.out.println((char)(n+1));
		System.out.println( (char)(ch+1) );
		
		System.out.println((double)n);
		System.out.println(n+.0);
		System.out.println(n+"");
		
		byte b2 = 40;
		int n5 = (int)b2;

	}

}
