package java04_application01.Basic;

import java.util.Scanner;

/*
 * ȸ�������� ���� ���� ���� �� �ʱ�ȭ
 */
public class Ex03Quiz01 {
	/////////////////////////////////////
	static String []names, ids, pws;
	static int idx;
	static void init(int size) {
		names = new String[size];
		ids = new String[size];
		pws = new String[size];
		
		idx = 0;
	}
	/////////////////////////////////////
	
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
		init(10);
		menu();
		int choice = in.nextInt();
		mainMenuExec(choice);
	}
}
/*
 * ���� �ڵ带 Ȱ���Ͽ� "1. ȸ������"�� �����Ͻÿ� 
 */
