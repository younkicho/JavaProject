package java02_Control_03For.Quiz;
/*
 * Quiz
/*
 *3. 음악 플레이어를 만들려고 한다. 현재 3분 50초 분량의 노래가 있다. 
 *   지금까지 진행도 노래 분량을 입력 받아 그림으로 표시하고 
 *   몇% 진행했는지 수치로 나타내는 프로그램을 작성하시오 
	
		<쉬운 예제>
		변수저장) 40
		출력) ■17%
	
		변수저장) 100 
		출력) ■■■■43% 
	
		<어려운 예제>
		변수저장) 40
		출력)
		┌──────────┐
		│■17%      │
		└──────────┘
	
		변수저장) 100 
		출력)
		┌──────────┐
		│■■■■43%   │
		└──────────┘
	
		초를 입력하세요?230
		┌──────────┐
		│■■■■■■■■■■100%
		└──────────┘
 */
public class Quiz03 {
	public static void main(String[] args ){
		int sec = (int)(Math.random()*20+3)*10;
		//#특수문자는 ㅂ을 누르고 한자를 눌러 나타나는 문자 활용 
		int totalMin = 230;
				
		System.out.println("┌──────────┐");
		int percent = sec*100/totalMin;
		String progress = "│";
		
		for (int i=0;i<percent/10;i++)
			progress += "■";
		progress += percent+"%";
				
		for (int i=(percent/10)+3;i<10;i++)
			progress +=" ";
		if((percent/10)<8)
			progress +="│";
		System.out.println(progress);
		System.out.print("└──────────┘");
	}
}

