package java05_class.Basic.Ex06.Quiz;
/*
 * ������ ����� �⺻ �������� this Ȱ��
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
/*
 * ������ ������� InputBox�� ChatBox�� �����ڸ� �߰��Ͻÿ�.
 */
