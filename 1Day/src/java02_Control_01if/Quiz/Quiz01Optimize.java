package java02_Control_01if.Quiz;

import java.util.Scanner;
/*
 * Quiz
 * �� ���� �Է¹޾� ū ���� ����Ͻÿ�
 * 
 * ���� �ذ� �ó�����
 * 1. �� ���� �Է¹޴´�.
 * 2. ù ��° ���� �� ��° ���� ���Ͽ� ù ��° ���� ũ�� max��� ������ ù ��° ���� �����Ѵ�.
 * 3. ù ��° ���� �� ��° ���� ���Ͽ� �� ��° ���� ũ�� max��� ������ �� ��° ���� �����Ѵ�.
 * 4. max�� �� ��° ���� ���Ͽ� �� ��° ���� ũ��  max�� �� ��° ���� �����Ѵ�. 
 * 5. max�� �� ��° ���� ���Ͽ� max�� ũ��  max�� max�� �����Ѵ�.
 * 6. max�� ����Ѵ�.
 * 
 * ����ȭ
 * ���� �ó��������� 5���� �ǹ̾��� �ڵ��̴�.
 */
public class Quiz01Optimize {
	public static void main(String[] args) {
		//1. �� ���� �Է¹޴´�.
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���?");
		int num1 = in.nextInt();
		System.out.print("���� �Է��ϼ���?");
		int num2 = in.nextInt();
		System.out.print("���� �Է��ϼ���?");
		int num3 = in.nextInt();
		
		//1.5. max��� ������ �����.
		int max = 0;
		
		//2. ù ��° ���� �� ��° ���� ���Ͽ� ù ��° ���� ũ�� max��� ������ ù ��° ���� �����Ѵ�.
		if(num1>num2)	max = num1;
		//3. ù ��° ���� �� ��° ���� ���Ͽ� �� ��° ���� ũ�� max��� ������ �� ��° ���� �����Ѵ�.
		else			max = num2;
		
		//4. max�� �� ��° ���� ���Ͽ� �� ��° ���� ũ��  max�� �� ��° ���� �����Ѵ�.
		if(max < num3)	max = num3;
		//5. max�� �� ��° ���� ���Ͽ� max�� ũ��  max�� max�� �����Ѵ�.
		//else			max = max;
		
		//6. max�� ����Ѵ�.
		System.out.println("���� ū ���� "+max+"�Դϴ�.");
	}
}
