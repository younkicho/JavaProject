package java04_application01.Basic;

import java.util.Scanner;

/*
 * 메뉴 선택하기
 */
public class Ex02 {
	static void menu() {
		System.out.println("============================");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
		System.out.println("============================");
		System.out.println("위의 메뉴를 선택하세요?");
	}
	static void mainMenuExec(int n) {
		System.out.println(n + "입력됨");
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		menu();
		int choice = in.nextInt();
		mainMenuExec(choice);
	}
}
/*
 * 위의 코드를 활용하여
 * 1을 입력하면 "회원가입 선택"
 * 2를 입력하면 "로그인 선택"
 * 3을 입력하면 "종료 선택"
 * 그 이외의 숫자는 "잘못된 수를 입력하였습니다."
 * 라고 출력되도록 코딩하시오. 
 */
