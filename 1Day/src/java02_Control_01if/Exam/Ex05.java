package java02_Control_01if.Exam;

import java.util.Scanner;
/*
 * visitStr�� �ʱⰪ�� "��"�� �Է��� �����ν� visitCnt�� 1���� ���� ��� 
 * ��, �ѹ��� �湮���� ���� ��츸 "ù"�̶�� ���ڸ� ����ϰ� 
 * �� �̿ܿ��� "��"�� ��µǴ� �ڵ��̴�.
 */
public class Ex05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("�湮 Ƚ���� �Է��ϼ���");
		int visitCnt = in.nextInt();
		//String visitStr = null;
		String visitStr = "��";
		
		if(visitCnt<1)	visitStr = "ù";
		//else			visitStr = "��";
		
		System.out.print(visitStr + " �湮 �����մϴ�.");
	}
}
/*
 * Quiz
 * �� ���� �Է¹޾� ū ���� ����Ͻÿ�
 */
