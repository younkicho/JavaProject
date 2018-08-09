package java05_class.Basic.Ex02.Quiz;
/*
 * 간략한 클래스 사용법 익히기
 */
public class Ex01 {
	public static void main(String[] args){
		Member member = new Member();
		
		member.setId("조윤기");
		member.setPicture("사진없음.");
		
		System.out.print(member.getPicture() + 
				" " + member.getId());
	}
}
