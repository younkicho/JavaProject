package java02_Control_01if.Quiz;

import java.util.Scanner;
/*
 * Quiz
 * 1. 숫자를 판별하여 다음과 같이 출력하도록 코딩하시오
 * 		판별할 수 : 5
 * 		양수 : 5
 *		판별할 수 : -7
 *		음수 : 7
 * 
 * 문제 해결 시나리오
 * 1. 수를 입력받는다.
 * 2. 입력받은 수를 비교하여 0보다 크면 "양수"를 출력 문자열에 저장한다.
 * 3. 입력받은 수가 0보다 작으면 "음수"를 출력문자열에 저장한다.
 * 4. 입력받은 수가 0이면 "0"을 출력문자열에 저장한다. 
 * 5. 출력문자열과 입력받은 값을 출력한다.
 */
public class Quiz02 {
	public static void main(String[] args) {
		//1. 수를 입력받는다.
		Scanner in = new Scanner(System.in);
		
		System.out.print("수를 입력하세요?");
		int num = in.nextInt();
				
		//1.5. 결과를 저장할 출력문자열 변수를 만든다.
		String output = null;
		
		//2. 입력받은 수를 비교하여 0보다 크면 "양수"를 출력 문자열에 저장한다.
		if(num>0)	output = "양수 : ";
		//3. 입력받은 수가 0보다 작으면 "음수"를 출력문자열에 저장한다.
		if(num<0)	output = "음수 : ";
		//4. 입력받은 수가 0이면 "0"을 출력문자열에 저장한다.
		if(num==0)	output = "0 : ";
		
		//5. 출력문자열과 입력받은 값을 출력한다.
		System.out.println(output+num);
	}
}
