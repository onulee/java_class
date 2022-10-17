package p1017;

import java.util.Scanner;

public class J1017_06 {

	public static void main(String[] args) {
		// 입력한 2자리 숫자와 랜덤 2자리 숫자가 몇개 맞는지 출력하시오.
		// 12 -> 72 : 1개
		// 02 -> 13 : 0개
		// 98 -> 90 : 1개
		// 45 -> 54 : 0개
		
		// 입력한 2자리 숫자
		Scanner scan = new Scanner(System.in);
		String choice ="";
		char ch=' ',ch2 =' ';
		int num=0,num2=0;
		
		System.out.println("2자리 숫자를 입력하세요.(예:27)>>"); 
		choice = scan.next();        
		
		ch = choice.charAt(0);      
		ch2 = choice.charAt(1);     
		
		System.out.println("입력한 숫자 : ");
		System.out.println(ch);     
		System.out.println(ch2);
		
		// 랜덤 2자리 숫자
		int input=0;
		char ch3=' ',ch4=' ';
		String choice2="";
		input = (int)(Math.random()*100); 
	    choice2 = String.format("%02d", input); 
		
		ch3 = choice2.charAt(0);
		ch4 = choice2.charAt(1);
		
		System.out.println("랜덤 숫자 : ");
		System.out.println(ch3);     
		System.out.println(ch4);
		
		int count=0;
		if(ch==ch3)
			count++;
		
		if(ch2==ch4)
			count++;
		
		System.out.println("동일한 숫자개수 : "+count);
		
		
		
		
		
		

	}

}
