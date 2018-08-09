package Java01_Basic;

import java.util.Scanner;
/*
 * age는 문자열이므로 10을 더하면 1010이 출력되게 된다.
 */
public class Ex03_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String age = in.next();
		System.out.println(age+10);
	}
}
