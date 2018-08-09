package java02_Control_01if.Exam;

import java.util.Scanner;
/*
 * 크다의 반대는 작다가 아니라 작거나 같다이다.
 * 다음 예제를 통해 확인
 */
public class Ex02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("방문 횟수를 입력하세요");
		int visitCnt = in.nextInt();
		
		if(visitCnt<1) {
			System.out.print("첫 방문 감사합니다.");
		}
		if(visitCnt>=1) {
			System.out.print("재 방문 감사합니다.");
		}
	}
}

