package java03_array;

public class Ex02 {
	public static void main(String[] args){
		int [] nums;
		int i;
		nums = new int[10];
		
		
		for(i=0;i<10;i++) {
			nums[i] = i*i;
		}
		
		for(i=0;i<nums.length;i++) {
			if(nums[i]==36)	break;
		}
		System.out.println(i+"번째 중복된 숫자가 존재합니다.");
	}
}

/*
 * 로또 번호 생성기 제작
 * 1~45사이의 임의의 숫자 6개를 출력하는 프로그램을 제작하시오(중복 인정)
 */
