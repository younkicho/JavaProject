package java04_application02.Advanced;

import java.util.Scanner;
/*
 * 4�ڸ��� ������ ���� ������ ���
 * 12�� ������ �Ǹ� �� �ڸ� ���� �ȴ�.
 * �̸� 0012�� �����ϱ� ���� String.format("%04d", 12)��
 * Ȱ���ϴ� ����� ���� �����Ѵ�.
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
		System.out.print("���� �Է��ϼ���?");
		int insertNum = in.nextInt();
		//int certiNum = getCertiNum(insertNum);
		String certiNum = getCertiNum(insertNum);
		
		System.out.println("�Է� �� : "+insertNum);
		System.out.println("������ȣ : "+certiNum);
	}
}