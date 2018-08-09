package Java01_Basic;

import java.util.Scanner;
/*
 * 숫자 입력법 학습
 */
public class Ex03_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		System.out.println(age+10);
	}
}
/*
 * 다음과 같이 동작되도록 코딩하시오
 * 
 * 당신의 이름을 입력하세요?000
 * 000님의 나이를 입력해 주세요?xx
 * 000님은 xx살이군요
 */