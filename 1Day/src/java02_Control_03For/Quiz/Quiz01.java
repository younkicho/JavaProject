package java02_Control_03For.Quiz;
/*
 * Quiz
 * 2. ������ ���ǿ� �µ��� 10���� ������ ���� ����Ͻÿ�
 * 			a. ���� ������ 1~100���� ���Ѵ�.
 * 			b. 10���� ���� �������ϰ� �����ϸ� ���� ū ���� �ѹ� �� ����Ͻÿ�
 */
public class Quiz01 {
	public static void main(String[] args ){
int max=0, randNum;
		
		for (int i=0;i<10;i++){
			randNum = (int)(Math.random()*100)+1;
			if(max<randNum)	max = randNum;
			System.out.print(" " + randNum);
		}
		
		System.out.println("\nmax : " + max);
	}
}

