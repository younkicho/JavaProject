package java04_application01.Basic;

import java.util.Scanner;

/*
 * 메뉴 선택하기
 */
public class Ex02Quiz {
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
		menu();
		int choice = in.nextInt();
		mainMenuExec(choice);
	}
}
