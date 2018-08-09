package java02_Control_01if.Exam;

import java.util.Scanner;
/*
 * 간단한 조건문 사용법
 */
public class Ex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("방문 횟수를 입력하세요");
		int visitCnt = in.nextInt();
		
		if(visitCnt<1) {
			System.out.print("첫 방문 감사합니다.");
		}
	}
}

