package java05_class.Quiz.Ex05;
/*
 * 다형성 개념과 기본 생성자의 this 활용
 */
public class Ex01 {
	public static void main(String[] args){
		Member member[] = new Member[2];
		member[0] = new Member();
		member[1] = new Member("조윤기", "사진없음.");
		
		System.out.print(member[0].getId() + 
				" " + member[1].getId());
	}
}
/*
 * 기존에 만들었던 InputBox와 ChatBox의 생성자를 추가하시오.
 */
