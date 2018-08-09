package java04_application02.Advanced;

import java.util.Scanner;
/*
 * return 개념 이해
 */
public class Ex01 {
	static int getCertiNum(int n) {
		return n*n;
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

/*
 * Quiz
 * 입력한 수의 자리수 만큼에 대한 임의의 값이 나올 수 있도록 코딩하시오
 * ex)
 * 수를 입력하세요?4
 * 
 * 0~10000 사이의 임의의 난수 반환
 */ 
