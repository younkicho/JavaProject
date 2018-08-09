package java02_Control_01if.Exam;

import java.util.Scanner;
/*
 * visitStr의 초기값을 "재"를 입력해 줌으로써 visitCnt가 1보다 작을 경우 
 * 즉, 한번도 방문하지 않은 경우만 "첫"이라는 글자를 출력하고 
 * 그 이외에는 "재"가 출력되는 코드이다.
 */
public class Ex05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("방문 횟수를 입력하세요");
		int visitCnt = in.nextInt();
		//String visitStr = null;
		String visitStr = "재";
		
		if(visitCnt<1)	visitStr = "첫";
		//else			visitStr = "재";
		
		System.out.print(visitStr + " 방문 감사합니다.");
	}
}
/*
 * Quiz
 * 두 수를 입력받아 큰 수를 출력하시오
 */
