package java04_application02.Advanced;

import java.util.Scanner;
/*
 * return ���� ����
 */
public class Ex01 {
	static int getCertiNum(int n) {
		return n*n;
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

/*
 * Quiz
 * �Է��� ���� �ڸ��� ��ŭ�� ���� ������ ���� ���� �� �ֵ��� �ڵ��Ͻÿ�
 * ex)
 * ���� �Է��ϼ���?4
 * 
 * 0~10000 ������ ������ ���� ��ȯ
 */ 
