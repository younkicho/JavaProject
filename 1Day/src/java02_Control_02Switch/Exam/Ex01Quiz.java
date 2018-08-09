package java02_Control_02Switch.Exam;

public class Ex01Quiz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randNum = (int) (Math.random() * 100);
		 
		System.out.println(randNum+"점");
		System.out.print("학점 : ");
		switch(randNum/10){
		case 10:
		case 9:
			System.out.print("A");
			break;
		case 8:
			System.out.print("B");
			break;
		case 7:
			System.out.print("C");
			break;
		case 6:
			System.out.print("D");
			break;
		default:
			System.out.print("F");
			break;
		}
	}
}
/*
 * 위 코드를 다음과 같이 완성하시오
 * 95이상 A+
 * 90이상 A
 * 85이상 B+
 * 80이상 B
 * ......
 * 60미만 F
 */
