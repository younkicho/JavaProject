package java05_class.Basic.Ex02.Quiz;
/*
 * ������ Ŭ���� ���� ������
 */
public class Ex01 {
	public static void main(String[] args){
		Member member = new Member();
		
		member.setId("������");
		member.setPicture("��������.");
		
		System.out.print(member.getPicture() + 
				" " + member.getId());
	}
}
