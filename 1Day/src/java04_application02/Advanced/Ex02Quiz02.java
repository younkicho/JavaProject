package java04_application02.Advanced;

import java.util.Scanner;

import CARE.Lab.Mail;
/*
 * ���� �߼� ���� ����
 */
public class Ex02Quiz02 {
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
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String authNum =  getCertiNum(4) ;
		System.out.print("�������� �̸��� �ּҸ� �Է��ϼ���?");
		String email = in.next();
		System.out.print(authNum);
		//sendAuthNum(email, authNum);
		System.out.println(email + "���� ������ȣ�� �߼��Ͽ����ϴ�.");
		
		for(int i=0;i<3;i++) {
			System.out.print("������ȣ�� �Է��ϼ���?");
			String certiNum = in.next();
			if(authNum.equals(certiNum)) {
				System.out.println("������ �����Ͽ����ϴ�");
				return;
			}
			System.out.println("�߸��� ������ȣ�Դϴ�.");
		}
		System.out.println("������ �����Ͽ����ϴ�.");
	}
}

/*
 * Quiz
 * �� �ڵ带 Ȱ���Ͽ� ȸ�����Կ� �����Ͻÿ�
 */ 
