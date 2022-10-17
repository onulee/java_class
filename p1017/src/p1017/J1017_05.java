package p1017;

public class J1017_05 {

	public static void main(String[] args) {
		int input=0;
	    String choice ="";
	    
	    // 숫자를입력하는 대신 랜덤숫자로 변경
		input = (int)(Math.random()*100); //0 - 99   , 0,1,2,...9
		// 숫자를 문자열로 변환
		// 01,02,03,04,05,06 ......09, 10
	    choice = String.format("%02d", input); // 빈공백은 0으로 채워서 출력
		
				
		char ch=' ',ch2=' ';
		int num=0,num2=0;
		
		ch = choice.charAt(0);      //2    /num = Integer.parseInt(choice);  //27
		ch2 = choice.charAt(1);     //7
		
		System.out.println(ch);     // ascii코드 0:48 1:49 :2:50...
		System.out.println(ch2);
		System.out.println("더하기 : "+(ch+ch2)); //99
		
		num = ch-'0';
		num2 = ch2-'0';
		
		System.out.println("더하기 : "+(num+num2)); //3

	}

}
