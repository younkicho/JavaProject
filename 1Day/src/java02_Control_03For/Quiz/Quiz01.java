package java02_Control_03For.Quiz;
/*
 * Quiz
 * 2. 다음의 조건에 맞도록 10개의 랜덤한 수를 출력하시오
 * 			a. 수의 범위는 1~100으로 정한다.
 * 			b. 10개의 수를 무작위하게 나열하며 가장 큰 수만 한번 더 출력하시오
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

