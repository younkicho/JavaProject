package java04_application02.Advanced;

import CARE.Lab.Mail;
/*
 * ���� �߼� ���� ����
 */
public class Ex02 {
	public static void main(String[] args){
		Mail mail = new Mail();
		
		mail.setId("jin62002@gmail.com");
		mail.setPw("jin1234!");
		mail.setSndUsr("������", "jin62002@gmail.com");
		mail.SendMail("gloss62@naver.com", "test", "�ȳ��ϼ���");
		
		System.out.println("���� ����");
	}
}

/*
 * Quiz
 * �� ���Ϸ� ������ȣ�� �����ϴ� ���α׷��� ����ÿ�
 */ 
