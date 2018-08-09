package java04_application02.Advanced;

import java.util.Scanner;

import CARE.Lab.Mail;
/*
 * ȸ������ �� ���� ���� ����
 */
public class Ex02Quiz03 {
	static String []names, ids, pws;
	static int idx;
	static void init(int size) {
		names = new String[size];
		ids = new String[size];
		pws = new String[size];
		
		idx = 0;
	}
	
	static void membership(Scanner in) {
		/////////////////////////////////////////////
		if(authProc(in)!=true) {
			System.out.println("������ �����Ͽ����ϴ�.");
			return;
		}
		System.out.println("������ �����Ͽ����ϴ�");
		/////////////////////////////////////////////
		System.out.print("�̸��� �Է��ϼ���?");
		names[idx] = in.next();
		System.out.print("���̵� �Է��ϼ���?");
		ids[idx] = in.next();
		System.out.print("�н����带 �Է��ϼ���?");
		pws[idx] = in.next();
		idx++;
		System.out.print("ȸ�������� ���ϵ帳�ϴ�.");
	}

	static void addMember() {
		names[idx] = "������";
		ids[idx] = "infiscap";
		pws[idx++] = "1234";
		
		names[idx] = "ȫ�浿";
		ids[idx] = "gildong";
		pws[idx++] = "1111";
	}	
	static void menu() {
		System.out.println("============================");
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		System.out.println("3. ����");
		System.out.println("============================");
		System.out.println("���� �޴��� �����ϼ���?");
	}
	static void mainMenuExec(Scanner in, int n) {
		switch(n) {
		case 1:	membership(in);	break;
		case 2:LoginProc(in);break;
		case 3:programExit();
		default:System.out.println("�߸��� ��ȣ �Դϴ�.");
		}
	}

	static void programExit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
	/////////////////////////////////////////////
	static String getCertiNum(int n) {
		return String.format("%04d", (int)(Math.random() * Math.pow(10, n)));
	}
	static void sendAuthNum(String recvUsrEmail, String authNum) {
		Mail mail = new Mail();
		
		
		mail.setId("jin62002@gmail.com");
		mail.setPw("jin1234!");
		mail.setSndUsr("������", "jin62002@gmail.com");
		mail.SendMail(recvUsrEmail, "������ȣ", 
				"�ȳ��ϼ��� ����<br/>������ȣ�� [ "+authNum+" ] �Դϴ�.");
	}
	static boolean authProc(Scanner in){
		String authNum =  getCertiNum(4) ;
		System.out.print("�������� �̸��� �ּҸ� �Է��ϼ���?");
		String email = in.next();
		//////////////////////////////////////////////
		//���� �߼��� �ϸ� ������ �ӽ÷� ����ϴ� ���̸� �� ��� �����ؾ� ��.
		System.out.print(authNum);
		//sendAuthNum(email, authNum);
		System.out.println(email + "���� ������ȣ�� �߼��Ͽ����ϴ�.");
		
		for(int i=0;i<3;i++) {
			System.out.print("������ȣ�� �Է��ϼ���?");
			String certiNum = in.next();
			if(authNum.equals(certiNum)) {
				return true;
			}
			System.out.println("�߸��� ������ȣ�Դϴ�.");
		}
		
		return false;
	}
	/////////////////////////////////////////////
	static void LoginProc(Scanner in) {
		String id = null, pw = null;
		
		System.out.println("���̵� �Է��ϼ���");
		id = in.next();
		System.out.println("�н����带 �Է��ϼ���");
		pw = in.next();
		
		for(int i=0;i<idx;i++) {
			if(ids[i].equals(id)) {
				if(pws[i].equals(pw)) {
					System.out.println("�α��ο� �����Ͽ����ϴ�.");
					return;
				}
			}
		}
		System.out.println("�α��ο� �����Ͽ����ϴ�.");
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		init(10);
		addMember();
				
		menu();
		int choice = in.nextInt();
		mainMenuExec(in, choice);
	}
}
/*
 * Quiz
 * ȸ������ �� ���̵� �ߺ�üũ�� �ڵ��Ͻÿ� 
 */ 
