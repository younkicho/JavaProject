package java05_class.Basic.Ex05;
/*
 * 클래스도 일반 자료형처럼 배열을 사용할 수 있다.
 * 사실 우린 이미 알고 있었다.
 * 이전에 사용했던 String이 바로 클래스 였다.
 * 하나는 default 생성자로 또 하나는 인자를 전달한 생성자로 
 * 클래스를 만들었다.
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
