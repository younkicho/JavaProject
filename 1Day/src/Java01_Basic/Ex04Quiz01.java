package Java01_Basic;

import java.util.Scanner;
/*
 * ������ ����� ������
 */
public class Ex04Quiz01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("����� Ű�� �Է��ϼ���?(m����)");
		float height = in.nextFloat();
		float standardWeightMan = height * height * 22;
		float standardWeightWoman = height * height * 21;
		System.out.println("ǥ�� ü�� ���");
		System.out.println("==========================");
		System.out.println("���� : "+standardWeightMan);
		System.out.println("���� : "+standardWeightWoman);
		System.out.println("==========================");
	}
}
/*
 * ������ ���� ���۵ǵ��� �ڵ��Ͻÿ�
 * 1. ǥ�� ü�� ����ϱ�
 *   ���� : Ű * Ű * 22
 *   ���� : Ű * Ű * 21
 * 2. �񸸵� ����ϱ�
 *   (����ü�� - ǥ�� ü��) / ǥ�� ü�� * 100
 */