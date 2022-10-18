package p1018;

public class J1018_05 {

	public static void main(String[] args) {
		// 
		int[] score = {100,99,98};   //length
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		System.out.println("배열개수 : "+score.length);
		
		String str ="12345";
		System.out.println("문자열 길이 : "+str.length());
		
		//출력
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}

	}

}
