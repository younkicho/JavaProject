package java03_array;

public class Ex04 {
	public static void main(String[] args){
		String names[] = new String[10];
		int idx = 0;
		
		names[idx++] = "cho youn-ki";
		names[idx++] = "hong gil-dong";
		
		for(int i=0;i<idx;i++)
			System.out.println(names[i]);
		
		System.out.println("�迭�� ���̴� "+names.length+"�Դϴ�.");
		System.out.println("���� �迭�� "+idx+"���� �����Ͱ� �����մϴ�.");
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