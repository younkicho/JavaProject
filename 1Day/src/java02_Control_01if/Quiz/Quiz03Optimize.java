package java02_Control_01if.Quiz;

import java.util.Scanner;
/*
 * Quiz
 * 2. 태어난 년도 2자리를 변수에 저장받아 다음과 같이 출력하시오
 * 		출력) xx년에 태어난 당신은 00살입니다.
 * 
 * 문제 해결 시나리오
 * 1. 태어난 년도를 입력받는다.
 * 2. 올해 년도를 입력 받는다. 
 * 3. 올해년도 - 태어난 년도 + 100을 처리한다.
 * 4. 3번의 실행결과를 100으로 나누어 나머지를 나이에 저장한다. 
 * 5. 나이를 출력한다.
 */
public class Quiz03Optimize {
	public static void main(String[] args) {
		//1. 태어난 년도를 입력받는다.
		Scanner in = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력하세요?");
		int birthYear = in.nextInt();
		
		//2. 올해 년도를 입력 받는다. 
		System.out.print("현재 년도를 입력하세요?");
		int currentYear = in.nextInt();
		
		//3. 올해년도 - 태어난 년도 + 100을 처리한다.
		int age = currentYear - birthYear+100;
		
		//4. 3번의 실행결과를 100으로 나누어 나머지를 나이에 저장한다.
		//if(age<0)	age += 100;
		age %= 100;
		
		System.out.println("당신은 "+(age+1)+"살 입니다.");
	}
}
/*
 * 최대한 조건을 안다는 것이 좋다. 
 */