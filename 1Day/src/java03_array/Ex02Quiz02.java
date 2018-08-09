package java03_array;

public class Ex02Quiz02 {
	public static void main(String[] args){
		int [] lotto;
		int i;
		lotto = new int[6];
		
		
		for(i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45+1);
			for(int j=0;j<i;j++)
				if(lotto[j]==lotto[i]) i--;
		}
		
		for(i=0;i<lotto.length;i++) {
			System.out.println(lotto[i]);	
		}
		
	}
}

/*
 * 다른 방법으로 사용
 */
