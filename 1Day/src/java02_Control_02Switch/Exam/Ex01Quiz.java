package java02_Control_02Switch.Exam;

public class Ex01Quiz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randNum = (int) (Math.random() * 100);
		 
		System.out.println(randNum+"��");
		System.out.print("���� : ");
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
 * �� �ڵ带 ������ ���� �ϼ��Ͻÿ�
 * 95�̻� A+
 * 90�̻� A
 * 85�̻� B+
 * 80�̻� B
 * ......
 * 60�̸� F
 */
