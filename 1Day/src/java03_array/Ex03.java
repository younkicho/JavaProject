package java03_array;
/*
 * ���������� �̿��Ͽ� �����͸� ������ �� �ִ�.
 */
public class Ex03 {
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
			for(int j=0;j<i-1;j++) {
				if(lotto[i]<lotto[j]) {
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		for(i=0;i<lotto.length;i++) {
			System.out.println(lotto[i]);	
		}
		
	}
}

/*
 * �ٸ� ������� ���
 */
