package java04_application02.Advanced;

import CARE.Lab.Mail;
/*
 * ���� �߼� ���� ����
 */
public class Ex02Quiz01 {
	static String getCertiNum(int n) {
		return String.format("%04d", (int)(Math.random() * Math.pow(10, n)));
	}
	public static void main(String[] args){
		Mail mail = new Mail();
		String authNum = "�ȳ��ϼ��� ����<br/>"+
				"������ȣ�� [ "+ getCertiNum(4) +" ] �Դϴ�.";
		mail.setId("jin62002@gmail.com");
		mail.setPw("jin1234!");
		mail.setSndUsr("������", "jin62002@gmail.com");
		mail.SendMail("gloss62@naver.com", "������ȣ", authNum);
		
		System.out.println("���� ����");
	}
}

/*
 * Quiz
 * ������ ���� ���۵ǵ��� ���� ���α׷��� ����ÿ�
 * ex)
 * �������� �̸��� �ּҸ� �Է��ϼ���?gloss62@naver.com
 * gloss62@naver.com ���� ������ȣ�� �߼��Ͽ����ϴ�.
 * ������ȣ�� �Է��ϼ���?1234
 * �߸��� ������ȣ �Դϴ�.
 * ������ȣ�� �Է��ϼ���?6235
 * �����Ǿ����ϴ�.
 */ 
