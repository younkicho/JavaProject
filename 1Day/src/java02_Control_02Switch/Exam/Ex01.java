package java02_Control_02Switch.Exam;

public class Ex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randNum = (int) (Math.random() * 100);
		 
		System.out.println(randNum+"��");
		System.out.print("���� : ");
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
 * �� �ڵ带 �ϼ��Ͻÿ� 
 */
