package java04_application02.Advanced;

import java.util.Scanner;
/*
 * ���� ��ȣ ����
 */
public class Ex01Quiz01 {
	static int getCertiNum(int n) {
		int digit=1;
		int result=0;
		
		for(int i=0;i<n;i++)
			digit *=10;
		
		result = (int)(Math.random()*digit);
		return result;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���?");
		int insertNum = in.nextInt();
		int certiNum = getCertiNum(insertNum);
		
		System.out.println("�Է� �� : "+insertNum);
		System.out.println("������ȣ : "+certiNum);
	}
}