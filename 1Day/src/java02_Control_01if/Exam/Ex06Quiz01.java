package java02_Control_01if.Exam;

import java.util.Scanner;
/*
 * 시나리오 작성을 통해 사람이 이해할 수 있는 글을 먼저 작성 후
 * 코딩하면 편하다는 내용을 가르쳐 주기 위해 아래의 내용을 먼저 인지시킨다.
 *  
 * 문제 풀이 시나리오
 * 1. 두 수를 입력 받는다.
 * 2. 첫 번째 수와 두 번째 수를 비교해서 첫 번째 수가 크면 첫 번째 수를 출력한다.
 * 3. 첫 번째 수와 두 번째 수를 비교해서 두 번째 수가 크면 두 번째 수를 출력한다.
 * 4. 첫 번째 수와 두 번째 수를 비교해서 같으면 두 번째 수를 출력한다.
 */
public class Ex06Quiz01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("수를 입력하세요");
		int num1 = in.nextInt();
		System.out.println("수를 입력하세요");
		int num2 = in.nextInt();
		
		if(num1>num2)	System.out.println("큰수 : "+num1);
		if(num1<num2)	System.out.println("큰수 : "+num2);
		if(num1==num2)	System.out.println("큰수 : "+num2);
	}
}
