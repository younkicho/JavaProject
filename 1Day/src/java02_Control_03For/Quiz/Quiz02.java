package java02_Control_03For.Quiz;
/*
 * Quiz
 * 1. ���� ���ǿ� �µ��� �� ���� ������ ���� ����Ͻÿ�
 * 		a. ���������� ū�� ������ ����Ͻÿ�
 * 		b. ���� ������ 1~10���� ���Ͻÿ�
 */
public class Quiz02 {
	public static void main(String[] args ){
		int max=0, min=10, randNum;
		
		for (int i=0;i<2;i++){
			randNum = (int)(Math.random()*10)+1;
			if(max<randNum)	max = randNum;
			if(min>randNum) min = randNum;
		}
		
		System.out.println(min + " " + max);
	}
}

