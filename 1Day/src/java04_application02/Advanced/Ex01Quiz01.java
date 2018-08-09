package java04_application02.Advanced;

import java.util.Scanner;
/*
 * 인증 번호 생성
 */
public class Ex01Quiz01 {
	static int getCertiNum(int n) {
		int digit=1;
		int result=0;
		
		for(int i=0;i<n;i++)
			digit *=10;
		
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