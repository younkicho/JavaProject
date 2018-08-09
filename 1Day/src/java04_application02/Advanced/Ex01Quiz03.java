package java04_application02.Advanced;

import java.util.Scanner;
/*
 * 4자리의 임의의 수를 생성할 경우
 * 12가 나오게 되면 두 자리 수가 된다.
 * 이를 0012로 변경하기 위해 String.format("%04d", 12)를
 * 활용하는 방법에 대해 설명한다.
 */
public class Ex01Quiz03 {
	static String getCertiNum(int n) {
		/*
		double digit=0.0;
		int result=0;

		digit = Math.pow(10, n);
		result = (int)(Math.random()*digit);
		return result;
		*/
		return String.format("%04d", (int)(Math.random() * Math.pow(10, n)));
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력하세요?");
		int insertNum = in.nextInt();
		//int certiNum = getCertiNum(insertNum);
		String certiNum = getCertiNum(insertNum);
		
		System.out.println("입력 값 : "+insertNum);
		System.out.println("인증번호 : "+certiNum);
	}
}