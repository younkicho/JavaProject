package java05_class.Basic.Ex05;
/*
 * Ŭ������ �Ϲ� �ڷ���ó�� �迭�� ����� �� �ִ�.
 * ��� �츰 �̹� �˰� �־���.
 * ������ ����ߴ� String�� �ٷ� Ŭ���� ����.
 * �ϳ��� default �����ڷ� �� �ϳ��� ���ڸ� ������ �����ڷ� 
 * Ŭ������ �������.
 */
public class Ex01 {
	public static void main(String[] args){
		Member member[] = new Member[2];
		member[0] = new Member();
		member[1] = new Member("������", "��������.");
		
		System.out.print(member[0].getId() + 
				" " + member[1].getId());
	}
}
