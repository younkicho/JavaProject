package java04_application01.Basic;
/*
 * ȸ�� ������ ���� �迭 Ȱ���
 */
public class Ex03 {
	static String names[];
	static int idx;
	public static void main(String[] args){
		names = new String[10];
		idx = 0;
		
		names[idx++] = "cho youn-ki";
		names[idx++] = "hong gil-dong";
		
		for(int i=0;i<idx;i++)
			System.out.println(names[i]);
		
		System.out.println("�迭�� ���̴� "+names.length+"�Դϴ�.");
		System.out.println("���� �迭�� "+idx+"���� �����Ͱ� �����մϴ�.");
	}
}

/*
 * ���� �ڵ带 Ȱ���Ͽ� "1. ȸ������"�� ������ ���̴�.
 * ȸ�����Կ� ����� �̸�, ���̵�, �н����带 �迭�������� �����
 * �ʱ�ȭ�ϴ� �޼ҵ带 �����Ͻÿ�
 */
