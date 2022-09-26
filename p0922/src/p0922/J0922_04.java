package p0922;

public class J0922_04 {

	public static void main(String[] args) {
		char ch = 'a';
//		char ch2 = 'aa';
//		char ch3 = ''; //데이터 없는 것은 에러
		char ch4 = ' '; // 빈공백문자 가능
		String str = "";
		
		String s1 = "A"+"B";
		System.out.println(s1);
		
		System.out.println("A"+7);
		System.out.println("A"+7+7);
		System.out.println(7+7+"A");
		System.out.println(7+"");
		
		int num=7;
		String str2 = num + "";
		String str3 = 7 + "";
		
		char ch5 = '7'; //
		System.out.println(ch5+0);  // '7' : 55 + 0 = 55

	}

}
