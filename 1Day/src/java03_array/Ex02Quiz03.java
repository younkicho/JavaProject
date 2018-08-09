package java03_array;
/*
 * 순차적으로 증가하는 한정된 자원에서 활용하면 효율적이다.ㅏ
 */
public class Ex02Quiz03 {
	public static void main(String[] args){
		int [] lotto;
		int i=0;
		lotto = new int[45];
		
		
		while(true) {
			int idx = (int)(Math.random()*45);
			if(lotto[idx] ==0) {
				lotto[idx]=1;
				i++;
			}
				
			if(i>5)break;
		}
		
		for(i=0;i<lotto.length;i++) {
			if(lotto[i]==1)
				System.out.println(i+1);	
		}
		
	}
}
