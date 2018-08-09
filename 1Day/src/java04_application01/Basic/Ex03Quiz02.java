package java04_application01.Basic;

import java.util.Scanner;

/*
 * 회원 가입 구현
 */
public class Ex03Quiz02 {
	static String []names, ids, pws;
	static int idx;
	static void init(int size) {
		names = new String[size];
		ids = new String[size];
		pws = new String[size];
		
		idx = 0;
	}
	/////////////////////////////////////
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
	/////////////////////////////////////
	
	static void menu() {
		System.out.println("============================");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
		System.out.println("============================");
		System.out.println("위의 메뉴를 선택하세요?");
	}
	static void mainMenuExec(int n) {
		switch(n) {
		case 1:System.out.println("회원가입 선택");break;
		case 2:System.out.println("로그인 선택");break;
		case 3:System.out.println("종료 선택");break;
		default:System.out.println("잘못된 번호 입니다.");
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		init(10);
		menu();
		int choice = in.nextInt();
		mainMenuExec(choice);
		membership(in);
	}
}

