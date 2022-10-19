package p1019;

public class J1019_01 {

	public static void main(String[] args) {
		// 1-100까지 배열을 생성해서 숫자를 넣으시오.
		int[] num = new int[100];  //1-100
		int[] num2 = new int[100]; // num배열의 숫자를 가지고 num2 100-1까지 들어가도록 해보세요.
		
		for(int i=0;i<100;i++) {
			num[i]=i+1;   // num[0]=1,num[1]=2.....num[99]=100
		}
		
		for(int i=0;i<100;i++) { //0-99
			num2[i] = num[99-i];
		}
		
		for(int i=99;i>0;i--) { //0-99
			num2[99-i] = num[i];
		}
		
		// num배열의 숫자를 가지고 num2 100-1까지 들어가도록 해보세요.
		
		// num2[0]=100,     num2[1]=99,      num2[2]=98  ....
        // num2[0]=num[99], num2[1]=num[98], num2[2]=num[97]
	}

}
