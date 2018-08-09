package java02_Control_03For.Quiz;
/*
 * Quiz
 * 1. 다음 조건에 맞도록 두 개의 랜덤한 수를 출력하시오
 * 		a. 작은값부터 큰값 순으로 출력하시오
 * 		b. 수의 범위는 1~10으로 정하시오
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

