package java04_application01.Basic;
/*
 * 회원 가입을 위한 배열 활용법
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
		
		System.out.println("배열의 길이는 "+names.length+"입니다.");
		System.out.println("현재 배열은 "+idx+"개의 데이터가 존재합니다.");
	}
}

/*
 * 위의 코드를 활용하여 "1. 회원가입"을 구현할 것이다.
 * 회원가입에 사용할 이름, 아이디, 패스워드를 배열형식으로 만들고
 * 초기화하는 메소드를 구현하시오
 */
