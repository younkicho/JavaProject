package java04_application02.Advanced;

import java.util.Scanner;

import CARE.Lab.Mail;
/*
 * 회원가입 시 아이디 중복확인 구현
 */
public class Ex02Quiz04 {
	static String []names, ids, pws;
	static int idx;
	static void init(int size) {
		names = new String[size];
		ids = new String[size];
		pws = new String[size];
		
		idx = 0;
	}
	
	static void membership(Scanner in) {
		if(authProc(in)!=true) {
			System.out.println("인증에 실패하였습니다.");
			return;
		}
		System.out.println("인증에 성공하였습니다");

		System.out.print("이름을 입력하세요?");
		names[idx] = in.next();
		
		//System.out.print("아이디를 입력하세요?");
		//ids[idx] = in.next();
		createID(in);
		
		System.out.print("패스워드를 입력하세요?");
		pws[idx] = in.next();
		idx++;
		System.out.print("회원가입을 축하드립니다.");
	}
	/////////////////////////////////////////////
	static boolean isDuplicateID(Scanner in, String id) {
		for(int i=0;i<idx;i++) {
			if(ids[i].equals(id))
				return true;
		}
		return false;
	}
	
	static void createID(Scanner in) {
		String id = null;	
		while(true) {
			System.out.print("아이디를 입력하세요?");
			id = in.next();
			if(isDuplicateID(in, id) != true)
				break;
			System.out.println("아이디가 중복되었습니다");
		}
		ids[idx] = id;
	}
	/////////////////////////////////////////////
	static void addMember() {
		names[idx] = "조윤기";
		ids[idx] = "infiscap";
		pws[idx++] = "1234";
		
		names[idx] = "홍길동";
		ids[idx] = "gildong";
		pws[idx++] = "1111";
	}	
	static void menu() {
		System.out.println("============================");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
		System.out.println("============================");
		System.out.println("위의 메뉴를 선택하세요?");
	}
	static void mainMenuExec(Scanner in, int n) {
		switch(n) {
		case 1:	membership(in);	break;
		case 2:LoginProc(in);break;
		case 3:programExit();
		default:System.out.println("잘못된 번호 입니다.");
		}
	}

	static void programExit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

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
	static boolean authProc(Scanner in){
		String authNum =  getCertiNum(4) ;
		System.out.print("인증받은 이메일 주소를 입력하세요?");
		String email = in.next();
		//////////////////////////////////////////////
		//메일 발송을 하면 귀찮아 임시로 출력하는 것이며 실 운영시 삭제해야 함.
		System.out.print(authNum);
		//sendAuthNum(email, authNum);
		System.out.println(email + "으로 인증번호를 발송하였습니다.");
		
		for(int i=0;i<3;i++) {
			System.out.print("인증번호를 입력하세요?");
			String certiNum = in.next();
			if(authNum.equals(certiNum)) {
				return true;
			}
			System.out.println("잘못된 인증번호입니다.");
		}
		
		return false;
	}

	static void LoginProc(Scanner in) {
		String id = null, pw = null;
		
		System.out.println("아이디를 입력하세요");
		id = in.next();
		System.out.println("패스워드를 입력하세요");
		pw = in.next();
		
		for(int i=0;i<idx;i++) {
			if(ids[i].equals(id)) {
				if(pws[i].equals(pw)) {
					System.out.println("로그인에 성공하였습니다.");
					return;
				}
			}
		}
		System.out.println("로그인에 실패하였습니다.");
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

