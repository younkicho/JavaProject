package Java01_Basic;

import java.util.Scanner;

public class Ex04Quiz02 {
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
		
		System.out.print("당신의 몸무게를 입력하세요?");
		float weight = in.nextFloat();
		
		System.out.println();
		System.out.println("비만도 계산");
		System.out.println("==========================");
		System.out.println("남자 : "+((weight - standardWeightMan)/standardWeightMan)*100);
		System.out.println("여자 : "+(weight - standardWeightWoman)/standardWeightWoman*100);
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