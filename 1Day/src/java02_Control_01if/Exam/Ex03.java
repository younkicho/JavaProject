package java02_Control_01if.Exam;

import java.util.Scanner;
/*
 * if�� �ݴ븦 ǥ���ϴ� ������ else�̴�.
 */
public class Ex03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("�湮 Ƚ���� �Է��ϼ���");
		int visitCnt = in.nextInt();
		
		if(visitCnt<1) {
			System.out.print("ù �湮 �����մϴ�.");
		}
		//if(visitCnt>=1) {
		else {
			System.out.print("�� �湮 �����մϴ�.");
		}
	}
}

