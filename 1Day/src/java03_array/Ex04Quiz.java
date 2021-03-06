package java03_array;

import java.util.Scanner;

public class Ex04Quiz {
	public static void main(String[] args){
		String names[] = new String[10];
		int idx = 0;
		
		names[idx++] = "cho youn-ki";
		names[idx++] = "hong gil-dong";
		
		////////////////////////////////////////////////
		System.out.print("당신은 누구신가요?");
		Scanner in = new Scanner(System.in);
		names[idx++] = in.next();
		////////////////////////////////////////////////
		
		System.out.println();
		System.out.println("현재 등록되어 있는 인원은");
		for(int i=0;i<idx;i++)
			System.out.println(names[i]);
		
		System.out.println("입니다.");
	}
}

/*
 * 위의 코드를 활용하여 추가적으로 한명의 이름을 키보드로 입력받아 출력하는 프로그램을 만드시오
 * Ex)
 * 
 * 당신은 누구신가요?행인1
 * 
 * 현재 등록되어 있는 인원은
 * cho youn-ki
 * hong gil-dong
 * 행인1
 * 입니다.
 */