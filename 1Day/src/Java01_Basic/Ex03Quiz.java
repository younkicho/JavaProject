package Java01_Basic;

import java.util.Scanner;
/*
 * ���ڿ� ���ڿ� ���� �н�
 */
public class Ex03Quiz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("����� �̸��� �Է��ϼ���?");
		String name = in.next();
		System.out.print(name+"�� ���̸� �Է��ϼ���?");
		int age = in.nextInt();
		System.out.println(name+"���� " + age + "���̱���");
	}
}
