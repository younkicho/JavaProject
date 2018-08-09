package java03_array;

public class Ex02Quiz01 {
	public static void main(String[] args){
		int [] lotto;
		int i;
		lotto = new int[6];
		
		
		for(i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45+1);
		}
		
		for(i=0;i<lotto.length;i++) {
			System.out.println(lotto[i]);	
		}
		
	}
}

/*
 * 로또 번호 생성기 제작
 * 1~45사이의 임의의 숫자 6개를 출력하는 프로그램을 제작하시오
 * 중복된 수를 배제하시오
 */
