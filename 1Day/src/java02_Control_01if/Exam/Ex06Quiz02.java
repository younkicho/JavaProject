package java02_Control_01if.Exam;

import java.util.Scanner;
/*
 * ����ȭ �ϴ� ����� �˷� �ֱ� ���� ������ 
 * �⺻ �ڵ忡�� ��� ��ȭ�ϴ��� ������ ���� �����̴�.
 * 
 * ���� Ǯ�� ����ȭ �ó�����
 * 1. �� ���� �Է� �޴´�.
 * 2. ù ��° ���� �� ��° ���� ���ؼ� ù ��° ���� ũ�� ù ��° ���� ����Ѵ�.
 * 3. ù ��° ���� �� ��° ���� ���ؼ� �� ��° ���� ũ�� �� ��° ���� ����Ѵ�.
 * 4. ù ��° ���� �� ��° ���� ���ؼ� ������ ù ��° ���� ����Ѵ�.
 * 
 * ���� �������� 3���� 4���� ���� ����� ��������� ���� �ش�.
 * 1. �� ���� �Է� �޴´�.
 * 2. ù ��° ���� �� ��° ���� ���ؼ� ù ��° ���� ũ�� ù ��° ���� ����Ѵ�.
 * 3. ù ��° ���� �� ��° ���� ���ؼ� �� ��° ���� ũ�ų� ������ �� ��° ���� ����Ѵ�.
 */
public class Ex06Quiz02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���");
		int num1 = in.nextInt();
		System.out.println("���� �Է��ϼ���");
		int num2 = in.nextInt();
		
		if(num1>num2)	System.out.println("ū�� : "+num1);
		if(num1<=num2)	System.out.println("ū�� : "+num2);
		//if(num1==num2)	System.out.println("ū�� : "+num1);
	}
}
