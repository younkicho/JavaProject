package java05_class.Basic.Ex01;
class car{
	String outColor;
	int	wheel;
	int	engine;
}
public class Ex01 {
	public static void main(String[] args){
		car c = new car();
		
		c.outColor = "red";
		c.wheel = 17;
		c.engine = 2000;
		
		System.out.println(c.outColor);
	}
}
/*
 * Quiz
 * ��ǻ�� Ŭ������ �����
 * main Ŭ�������� ����� ����Ͻÿ�
 */