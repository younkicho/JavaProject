package Java01_Basic;

import java.util.Scanner;
/*
 * 문자열을 연결할 수 있다는 것을 보여주기 위한 퀴즈
 */
public class Ex02Quiz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하세요?");
		String name = in.next();
		System.out.print(name);
		System.out.println("님 안녕하세요");
		System.out.println("========================");
		System.out.println(name+"님 안녕하세요");
	}
}
/*
 * 당신의 이름을 입력하세요? 000
 * 000님 안녕하세요
 */