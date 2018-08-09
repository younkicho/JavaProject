package java04_application02.Advanced;

import java.util.Scanner;
/*
 * Math.pow 사용법 익히기
 */
public class Ex01Quiz02 {
	static int getCertiNum(int n) {
		double digit=0.0;
		//int digit=1;
		int result=0;
		/*
		for(int i=0;i<n;i++)
			digit *=10;
		*/
		digit = Math.pow(10, n);
		result = (int)(Math.random()*digit);
		return result;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력하세요?");
		int insertNum = in.nextInt();
		int certiNum = getCertiNum(insertNum);
		
		System.out.println("입력 값 : "+insertNum);
		System.out.println("인증번호 : "+certiNum);
	}
}