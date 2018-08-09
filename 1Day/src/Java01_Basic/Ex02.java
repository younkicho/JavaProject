package Java01_Basic;

import java.util.Scanner;
/*
 * 개인적으로 자바는 웹개발을 위한 것이라고 생각하며
 * 콘솔에서 입력하는 것을 많이 하지 않을 것이므로 
 * 입력 클래스는 아래 예제 이외에는 사용하지 않을 것임. 
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next();
		System.out.println(name);
	}
}
/*
 * 당신의 이름을 입력하세요? 000
 * 000님 안녕하세요
 */