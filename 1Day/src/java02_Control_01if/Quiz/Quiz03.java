package java02_Control_01if.Quiz;

import java.util.Scanner;
/*
 * Quiz
 * 2. �¾ �⵵ 2�ڸ��� �Է¹޾� ������ ���� ����Ͻÿ�
 * 		���) xx�⿡ �¾ ����� 00���Դϴ�.
 * 
 * ���� �ذ� �ó�����
 * 1. �¾ �⵵�� �Է¹޴´�.
 * 2. ���� �⵵�� �Է� �޴´�. 
 * 3. ���� �⵵���� �¾ �⵵�� ����.
 * 4. ���̰� ������ ��� 100�� ���Ѵ�. 
 * 5. ���̸� ����Ѵ�.
 */
public class Quiz03 {
	public static void main(String[] args) {
		//1. �¾ �⵵�� �Է¹޴´�.
		Scanner in = new Scanner(System.in);
		
		System.out.print("�¾ �⵵�� �Է��ϼ���?");
		int birthYear = in.nextInt();
		
		//2. ���� �⵵�� �Է� �޴´�. 
		System.out.print("���� �⵵�� �Է��ϼ���?");
		int currentYear = in.nextInt();
		
		//3. ���� �⵵���� �¾ �⵵�� ����.
		int age = currentYear - birthYear;
		
		//4. ���̰� ������ ��� 100�� ���Ѵ�.
		if(age<0)	age += 100;
		
		System.out.println("����� "+(age+1)+"�� �Դϴ�.");
	}
}
