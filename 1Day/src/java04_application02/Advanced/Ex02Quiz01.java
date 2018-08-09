package java04_application02.Advanced;

import CARE.Lab.Mail;
/*
 * 메일 발송 개념 이해
 */
public class Ex02Quiz01 {
	static String getCertiNum(int n) {
		return String.format("%04d", (int)(Math.random() * Math.pow(10, n)));
	}
	public static void main(String[] args){
		Mail mail = new Mail();
		String authNum = "안녕하세요 고객님<br/>"+
				"인증번호는 [ "+ getCertiNum(4) +" ] 입니다.";
		mail.setId("jin62002@gmail.com");
		mail.setPw("jin1234!");
		mail.setSndUsr("조윤기", "jin62002@gmail.com");
		mail.SendMail("gloss62@naver.com", "인증번호", authNum);
		
		System.out.println("메일 전송");
	}
}

/*
 * Quiz
 * 다음과 같이 동작되도록 인증 프로그램을 만드시오
 * ex)
 * 인증받은 이메일 주소를 입력하세요?gloss62@naver.com
 * gloss62@naver.com 으로 인증번호를 발송하였습니다.
 * 인증버호를 입력하세요?1234
 * 잘못된 인증번호 입니다.
 * 인증버호를 입력하세요?6235
 * 인증되었습니다.
 */ 
