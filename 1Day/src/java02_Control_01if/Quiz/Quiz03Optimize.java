package java02_Control_01if.Quiz;

import java.util.Scanner;
/*
 * Quiz
 * 2. �¾ �⵵ 2�ڸ��� ������ ����޾� ������ ���� ����Ͻÿ�
 * 		���) xx�⿡ �¾ ����� 00���Դϴ�.
 * 
 * ���� �ذ� �ó�����
 * 1. �¾ �⵵�� �Է¹޴´�.
 * 2. ���� �⵵�� �Է� �޴´�. 
 * 3. ���س⵵ - �¾ �⵵ + 100�� ó���Ѵ�.
 * 4. 3���� �������� 100���� ������ �������� ���̿� �����Ѵ�. 
 * 5. ���̸� ����Ѵ�.
 */
public class Quiz03Optimize {
	public static void main(String[] args) {
		//1. �¾ �⵵�� �Է¹޴´�.
		Scanner in = new Scanner(System.in);
		
		System.out.print("�¾ �⵵�� �Է��ϼ���?");
		int birthYear = in.nextInt();
		
		//2. ���� �⵵�� �Է� �޴´�. 
		System.out.print("���� �⵵�� �Է��ϼ���?");
		int currentYear = in.nextInt();
		
		//3. ���س⵵ - �¾ �⵵ + 100�� ó���Ѵ�.
		int age = currentYear - birthYear+100;
		
		//4. 3���� �������� 100���� ������ �������� ���̿� �����Ѵ�.
		//if(age<0)	age += 100;
		age %= 100;
		
		System.out.println("����� "+(age+1)+"�� �Դϴ�.");
	}
}
/*
 * �ִ��� ������ �ȴٴ� ���� ����. 
 */