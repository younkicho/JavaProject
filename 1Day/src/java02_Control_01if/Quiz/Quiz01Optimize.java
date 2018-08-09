package java02_Control_01if.Quiz;

import java.util.Scanner;
/*
 * Quiz
 * 세 수를 입력받아 큰 수를 출력하시오
 * 
 * 문제 해결 시나리오
 * 1. 세 수를 입력받는다.
 * 2. 첫 번째 수와 두 번째 수를 비교하여 첫 번째 수가 크면 max라는 변수에 첫 번째 수를 저장한다.
 * 3. 첫 번째 수와 두 번째 수를 비교하여 두 번째 수가 크면 max라는 변수에 두 번째 수를 저장한다.
 * 4. max와 세 번째 수를 비교하여 세 번째 수가 크면  max에 세 번째 수를 저장한다. 
 * 5. max와 세 번째 수를 비교하여 max가 크면  max에 max를 저장한다.
 * 6. max를 출력한다.
 * 
 * 최적화
 * 위의 시나리오에서 5번은 의미없는 코드이다.
 */
public class Quiz01Optimize {
	public static void main(String[] args) {
		//1. 세 수를 입력받는다.
		Scanner in = new Scanner(System.in);
		
		System.out.print("수를 입력하세요?");
		int num1 = in.nextInt();
		System.out.print("수를 입력하세요?");
		int num2 = in.nextInt();
		System.out.print("수를 입력하세요?");
		int num3 = in.nextInt();
		
		//1.5. max라는 변수를 만든다.
		int max = 0;
		
		//2. 첫 번째 수와 두 번째 수를 비교하여 첫 번째 수가 크면 max라는 변수에 첫 번째 수를 저장한다.
		if(num1>num2)	max = num1;
		//3. 첫 번째 수와 두 번째 수를 비교하여 두 번째 수가 크면 max라는 변수에 두 번째 수를 저장한다.
		else			max = num2;
		
		//4. max와 세 번째 수를 비교하여 세 번째 수가 크면  max에 세 번째 수를 저장한다.
		if(max < num3)	max = num3;
		//5. max와 세 번째 수를 비교하여 max가 크면  max에 max를 저장한다.
		//else			max = max;
		
		//6. max를 출력한다.
		System.out.println("가장 큰 수는 "+max+"입니다.");
	}
}
