package java04_application01.Basic;

import java.util.Scanner;

/*
 * �޴� �����ϱ�
 */
public class Ex02 {
	static void menu() {
		System.out.println("============================");
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		System.out.println("3. ����");
		System.out.println("============================");
		System.out.println("���� �޴��� �����ϼ���?");
	}
	static void mainMenuExec(int n) {
		System.out.println(n + "�Էµ�");
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		menu();
		int choice = in.nextInt();
		mainMenuExec(choice);
	}
}
/*
 * ���� �ڵ带 Ȱ���Ͽ�
 * 1�� �Է��ϸ� "ȸ������ ����"
 * 2�� �Է��ϸ� "�α��� ����"
 * 3�� �Է��ϸ� "���� ����"
 * �� �̿��� ���ڴ� "�߸��� ���� �Է��Ͽ����ϴ�."
 * ��� ��µǵ��� �ڵ��Ͻÿ�. 
 */
