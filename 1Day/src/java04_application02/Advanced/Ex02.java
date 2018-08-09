package java04_application02.Advanced;

import CARE.Lab.Mail;
/*
 * 메일 발송 개념 이해
 */
public class Ex02 {
	public static void main(String[] args){
		Mail mail = new Mail();
		
		mail.setId("jin62002@gmail.com");
		mail.setPw("jin1234!");
		mail.setSndUsr("조윤기", "jin62002@gmail.com");
		mail.SendMail("gloss62@naver.com", "test", "안녕하세요");
		
		System.out.println("메일 전송");
	}
}

/*
 * Quiz
 * 이 메일로 인증번호를 전송하는 프로그램을 만드시오
 */ 
