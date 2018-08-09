package java02_Control_01if.Exam;

import java.util.Scanner;
/*
 * "방문 감사합니다." 문구는 참과 거짓 두 가지 모두 동작함으로 마지막에 한번만 출력하면된다.
 */
public class Ex04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("방문 횟수를 입력하세요");
		int visitCnt = in.nextInt();
		String visitStr = null;
		
		if(visitCnt<1)	visitStr = "첫";
		else			visitStr = "재";
		
		System.out.print(visitStr + " 방문 감사합니다.");
	}
}

