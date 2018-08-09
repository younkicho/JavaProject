package java02_Control_01if.Quiz;

import java.util.Scanner;
/*
 * Quiz
 * 3. 총 싸움 게임을 만들려고 한다. 
 * 총 별 유효사거리가 존재하며 유효사거리에 따라 사격의 정확도를 게임에 넣으려고 한다. 
 * 유효사거리를 연습시키기위한 연습장을 만들려고 하는데 사용 가능한 총은 베레타 M92FS 권총뿐이다.
 * 유효사거리는 50m이며 사용자의 현재 위치와 타겟의 거리를 계산하는 프로그램을 작성해 보라.
 * 	
 * 		변수저장)사용자의 거리를 변수에 저장하세요?80
 * 		출력)최대유효사거리보다 30m 멉니다.
 * 			
 * 		변수저장)사용자의 거리를 변수에 저장하세요?39
 * 		출력)최대유효사거리보다 11m 가깝습니다.
 * 
 * 문제 해결 시나리오
 * 1. 최대유효사거리를 저장한다.
 * 2. 적과의 거리를 입력받는다. 
 * 3. 유효사거리보다 먼 경우 "멀리 있다"를 저장한다.
 * 4. 유효사거리보다 가까운 경우 " 가깝다"를 저장한다.
 * 5. 유효사거리가 같은 경우 "일치한다"를 저장한다. 
 * 6. 결과를 출력한다.
 */
public class Quiz04 {
	public static void main(String[] args) {
		//1. 유효사거리를 저장한다.
		int maxEffectiveRange = 50;
		
		//2. 적과의 거리를 입력받는다.
		Scanner in = new Scanner(System.in);
		
		System.out.print("사용자의 거리를 변수에 저장하세요?");
		int distance = in.nextInt();
		String outputStr=null;
		
		//3. 유효사거리보다 먼 경우 "멀리 있다"를 저장한다.
		if (distance>50)
			outputStr = "보다 "+(distance-50)+"m 멀리 있습니다.";
		//4. 유효사거리보다 가까운 경우 " 가깝다"를 저장한다.
		else if( distance<50)
			outputStr = "보다 "+(50-distance)+"m 가까이 있습니다.";
		//5. 유효사거리가 같은 경우 "일치한다"를 저장한다.
		else
			outputStr = "와 정확히 일치합니다.";
		//6. 결과를 출력한다.
		System.out.println("최대유효사거리"+(outputStr));
	}
}
