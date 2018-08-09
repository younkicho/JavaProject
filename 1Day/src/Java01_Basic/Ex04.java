package Java01_Basic;

import java.util.Scanner;
/*
 * 실수 입력방법 학습
 */
public class Ex04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float height = in.nextFloat();
		System.out.println(height);
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