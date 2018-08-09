package java02_Control_01if.Exam;

import java.util.Scanner;
/*
 * if의 반대를 표현하는 문법이 else이다.
 */
public class Ex03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("방문 횟수를 입력하세요");
		int visitCnt = in.nextInt();
		
		if(visitCnt<1) {
			System.out.print("첫 방문 감사합니다.");
		}
		//if(visitCnt>=1) {
		else {
			System.out.print("재 방문 감사합니다.");
		}
	}
}

