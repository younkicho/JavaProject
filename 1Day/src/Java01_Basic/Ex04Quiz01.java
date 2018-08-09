package Java01_Basic;

import java.util.Scanner;
/*
 * 간단한 연산법 익히기
 */
public class Ex04Quiz01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("당신의 키를 입력하세요?(m기준)");
		float height = in.nextFloat();
		float standardWeightMan = height * height * 22;
		float standardWeightWoman = height * height * 21;
		System.out.println("표준 체중 계산");
		System.out.println("==========================");
		System.out.println("남자 : "+standardWeightMan);
		System.out.println("여자 : "+standardWeightWoman);
		System.out.println("==========================");
	}
}
/*
 * 다음과 같이 동작되도록 코딩하시오
 * 1. 표준 체중 계산하기
 *   남자 : 키 * 키 * 22
 *   여자 : 키 * 키 * 21
 * 2. 비만도 계산하기
 *   (현재체중 - 표준 체중) / 표준 체중 * 100
 */