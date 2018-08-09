package java04_application01.Basic;

import java.util.Scanner;

/*
 * 회원가입을 위한 변수 생성 및 초기화
 */
public class Ex03Quiz01 {
	/////////////////////////////////////
	static String []names, ids, pws;
	static int idx;
	static void init(int size) {
		names = new String[size];
		ids = new String[size];
		pws = new String[size];
		
		idx = 0;
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
	}
}
/*
 * 위의 코드를 활용하여 "1. 회원가입"을 구현하시오 
 */
