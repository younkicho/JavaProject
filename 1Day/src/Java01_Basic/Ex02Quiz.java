package Java01_Basic;

import java.util.Scanner;
/*
 * ���ڿ��� ������ �� �ִٴ� ���� �����ֱ� ���� ����
 */
public class Ex02Quiz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("����� �̸��� �Է��ϼ���?");
		String name = in.next();
		System.out.print(name);
		System.out.println("�� �ȳ��ϼ���");
		System.out.println("========================");
		System.out.println(name+"�� �ȳ��ϼ���");
	}
}
/*
 * ����� �̸��� �Է��ϼ���? 000
 * 000�� �ȳ��ϼ���
 */