package java05_class.Basic.Ex04;
/*
 * ������ ������ ���� ������
 */
public class Ex01 {
	public static void main(String[] args){
		Member member = new Member("������", "��������.");

		System.out.print(member.getPicture() + 
				" " + member.getId());
	}
}
