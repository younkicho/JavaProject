package java02_Control_01if.Exam;

import java.util.Scanner;
/*
 * "�湮 �����մϴ�." ������ ���� ���� �� ���� ��� ���������� �������� �ѹ��� ����ϸ�ȴ�.
 */
public class Ex04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("�湮 Ƚ���� �Է��ϼ���");
		int visitCnt = in.nextInt();
		String visitStr = null;
		
		if(visitCnt<1)	visitStr = "ù";
		else			visitStr = "��";
		
		System.out.print(visitStr + " �湮 �����մϴ�.");
	}
}

