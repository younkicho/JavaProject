package java02_Control_01if.Exam;

import java.util.Scanner;
/*
 * ũ���� �ݴ�� �۴ٰ� �ƴ϶� �۰ų� �����̴�.
 * ���� ������ ���� Ȯ��
 */
public class Ex02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("�湮 Ƚ���� �Է��ϼ���");
		int visitCnt = in.nextInt();
		
		if(visitCnt<1) {
			System.out.print("ù �湮 �����մϴ�.");
		}
		if(visitCnt>=1) {
			System.out.print("�� �湮 �����մϴ�.");
		}
	}
}

