package java02_Control_01if.Exam;

import java.util.Scanner;
/*
 * 문제 풀이 최적화 시나리오
 * 1. 두 수를 입력 받는다.
 * 2. 첫 번째 수와 두 번째 수를 비교해서 첫 번째 수가 크면 첫 번째 수를 출력한다.
 * 3. 첫 번째 수와 두 번째 수를 비교해서 두 번째 수가 크면 두 번째 수를 출력한다.
 * 4. 첫 번째 수와 두 번째 수를 비교해서 같으면 첫 번째 수를 출력한다.
 * 
 * 위의 구문에서 3번과 4번이 같은 결과를 출력함으로 묶어 준다.
 * 1. 두 수를 입력 받는다.
 * 2. 첫 번째 수와 두 번째 수를 비교해서 첫 번째 수가 크면 첫 번째 수를 출력한다.
 * 3. 첫 번째 수와 두 번째 수를 비교해서 두 번째 수가 크거나 같으면 두 번째 수를 출력한다.
 * 
 * 위의 구문에서 3번은 2번과 상반되는 이야기 임으로 else를 이용하여 처리한다.
 */
public class Ex06Quiz03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("수를 입력하세요");
		int num1 = in.nextInt();
		System.out.println("수를 입력하세요");
		int num2 = in.nextInt();
		
		if(num1>num2)	System.out.println("큰수 : "+num1);
		else			System.out.println("큰수 : "+num2);
		//if(num1<=num2)	System.out.println("큰수 : "+num2);
		//if(num1==num2)	System.out.println("큰수 : "+num1);
	}
}
/*
 * Quiz
 * 세 수를 입력받아 큰 수를 출력하시오
 */