package java03_array;

import java.util.Scanner;

public class Ex04Quiz {
	public static void main(String[] args){
		String names[] = new String[10];
		int idx = 0;
		
		names[idx++] = "cho youn-ki";
		names[idx++] = "hong gil-dong";
		
		////////////////////////////////////////////////
		System.out.print("����� �����Ű���?");
		Scanner in = new Scanner(System.in);
		names[idx++] = in.next();
		////////////////////////////////////////////////
		
		System.out.println();
		System.out.println("���� ��ϵǾ� �ִ� �ο���");
		for(int i=0;i<idx;i++)
			System.out.println(names[i]);
		
		System.out.println("�Դϴ�.");
	}
}

/*
 * ���� �ڵ带 Ȱ���Ͽ� �߰������� �Ѹ��� �̸��� Ű����� �Է¹޾� ����ϴ� ���α׷��� ����ÿ�
 * Ex)
 * 
 * ����� �����Ű���?����1
 * 
 * ���� ��ϵǾ� �ִ� �ο���
 * cho youn-ki
 * hong gil-dong
 * ����1
 * �Դϴ�.
 */