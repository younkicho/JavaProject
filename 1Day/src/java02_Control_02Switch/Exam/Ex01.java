package java02_Control_02Switch.Exam;

public class Ex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randNum = (int) (Math.random() * 100);
		 
		System.out.println(randNum+"점");
		System.out.print("학점 : ");
		switch(randNum/10){
		case 9:
			System.out.print("A");
			break;
		case 8:
			System.out.print("B");
			break;
		default:
			System.out.print("F");
			break;
		}
	}
}
/*
 * 위 코드를 완성하시오 
 */
