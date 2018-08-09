package java04_application01.Basic;

import java.util.Scanner;
/*
 * "3. 종료" 구현
 */
public class Ex06 {
	static String []names, ids, pws;
	static int idx;
	static void init(int size) {
		names = new String[size];
		ids = new String[size];
		pws = new String[size];
		
		idx = 0;
	}
	
	static void membership(Scanner in) {
		System.out.print("이름을 입력하세요?");
		names[idx] = in.next();
		System.out.print("아이디를 입력하세요?");
		ids[idx] = in.next();
		System.out.print("패스워드를 입력하세요?");
		pws[idx] = in.next();
		
		idx++;
		System.out.print("회원가입을 축하드립니다.");
	}

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
		case 1:membership(in);break;
		case 2:LoginProc(in);break;
		/////////////////////////////////////////////
		//코드 변경, 종료되는 코드임으로 break 불필요
		//case 3:System.out.println("종료 선택");break;
		case 3:programExit();
		default:System.out.println("잘못된 번호 입니다.");
		}
	}
	/////////////////////////////////////////////
	static void programExit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	/////////////////////////////////////////////
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

