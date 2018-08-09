package java05_class.Basic.Ex01Quiz;

public class Ex01 {
	public static void main(String[] args){
		Computer com = new Computer();
		
		com.cpu = "Intel(R) Core(TM) i7-4770";
		com.ram = 8;
		com.ram = 1024;
		
		System.out.println(com.cpu);
	}
}