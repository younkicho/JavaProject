package java02_Control_01if.Quiz;

import java.util.Scanner;
/*
 * Quiz
 * 2. 태어난 년도 2자리를 입력받아 다음과 같이 출력하시오
 * 		출력) xx년에 태어난 당신은 00살입니다.
 * 
 * 문제 해결 시나리오
 * 1. 태어난 년도를 입력받는다.
 * 2. 올해 년도를 입력 받는다. 
 * 3. 올해 년도에서 태어난 년도를 뺀다.
 * 4. 나이가 음수인 경우 100을 더한다. 
 * 5. 나이를 출력한다.
 */
public class Quiz03 {
	public static void main(String[] args) {
		//1. 태어난 년도를 입력받는다.
		Scanner in = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력하세요?");
		int birthYear = in.nextInt();
		
		//2. 올해 년도를 입력 받는다. 
		System.out.print("현재 년도를 입력하세요?");
		int currentYear = in.nextInt();
		
		//3. 올해 년도에서 태어난 년도를 뺀다.
		int age = currentYear - birthYear;
		
		//4. 나이가 음수인 경우 100을 더한다.
		if(age<0)	age += 100;
		
		System.out.println("당신은 "+(age+1)+"살 입니다.");
	}
}
