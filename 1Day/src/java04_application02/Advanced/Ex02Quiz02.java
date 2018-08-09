package java04_application02.Advanced;

import java.util.Scanner;

import CARE.Lab.Mail;
/*
 * 메일 발송 개념 이해
 */
public class Ex02Quiz02 {
	static String getCertiNum(int n) {
		return String.format("%04d", (int)(Math.random() * Math.pow(10, n)));
	}
	static void sendAuthNum(String recvUsrEmail, String authNum) {
		Mail mail = new Mail();
		
		
		mail.setId("jin62002@gmail.com");
		mail.setPw("jin1234!");
		mail.setSndUsr("조윤기", "jin62002@gmail.com");
		mail.SendMail(recvUsrEmail, "인증번호", 
				"안녕하세요 고객님<br/>인증번호는 [ "+authNum+" ] 입니다.");
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String authNum =  getCertiNum(4) ;
		System.out.print("인증받은 이메일 주소를 입력하세요?");
		String email = in.next();
		System.out.print(authNum);
		//sendAuthNum(email, authNum);
		System.out.println(email + "으로 인증번호를 발송하였습니다.");
		
		for(int i=0;i<3;i++) {
			System.out.print("인증번호를 입력하세요?");
			String certiNum = in.next();
			if(authNum.equals(certiNum)) {
				System.out.println("인증에 성공하였습니다");
				return;
			}
			System.out.println("잘못된 인증번호입니다.");
		}
		System.out.println("인증에 실패하였습니다.");
	}
}

/*
 * Quiz
 * 위 코드를 활용하여 회원가입에 적용하시오
 */ 
