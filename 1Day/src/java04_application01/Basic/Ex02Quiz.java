package java04_application01.Basic;

import java.util.Scanner;

/*
 * �޴� �����ϱ�
 */
public class Ex02Quiz {
	static void menu() {
		System.out.println("============================");
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		System.out.println("3. ����");
		System.out.println("============================");
		System.out.println("���� �޴��� �����ϼ���?");
	}
	static void mainMenuExec(int n) {
		switch(n) {
		case 1:System.out.println("ȸ������ ����");break;
		case 2:System.out.println("�α��� ����");break;
		case 3:System.out.println("���� ����");break;
		default:System.out.println("�߸��� ��ȣ �Դϴ�.");
		}
		
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		menu();
		int choice = in.nextInt();
		mainMenuExec(choice);
	}
}
