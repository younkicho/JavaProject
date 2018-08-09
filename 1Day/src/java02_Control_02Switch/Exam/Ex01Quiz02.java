package java02_Control_02Switch.Exam;

public class Ex01Quiz02 {
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
		
		if(randNum%10>=5 && randNum>=60 || randNum==100)
			System.out.print("+");
	 			 
		System.out.print("입니다.");

	}
}
