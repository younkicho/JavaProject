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
 * �ζ� ��ȣ ������ ����
 * 1~45������ ������ ���� 6���� ����ϴ� ���α׷��� �����Ͻÿ�
 * �ߺ��� ���� �����Ͻÿ�
 */
