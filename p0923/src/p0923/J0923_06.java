package p0923;

public class J0923_06 {

	public static void main(String[] args) {
		int num = 10;
		int octNum = 010;  //8진수  010 -> 8
		int hexNum = 0x10; 
		//16진수 010 -> 1,2,3,4,5,6,7,8,9,A,B,C,D,E,F,10,11,12....
		System.out.println(num);
		System.out.println(octNum);
		
		System.out.printf("%#o  %n", octNum);
		System.out.println(hexNum);
		System.out.printf("%#x", hexNum);

	}

}
