package java05_class.Basic.Ex04;
/*
 * 간략한 생성자 사용법 익히기
 */
public class Ex01 {
	public static void main(String[] args){
		Member member = new Member("조윤기", "사진없음.");

		System.out.print(member.getPicture() + 
				" " + member.getId());
	}
}
