package java03_array;

public class Ex01 {
	public static void main(String[] args){
		int [] nums;
		nums = new int[10];
		
		for(int i=0;i<10;i++) {
			nums[i] = i*i;
		}
		
		System.out.println(nums[3]);
	}
}

/*
 * 위의 내용을 다음과 같이 출력되도록 수정하시오. 

	1 x 1 = 1
	2 x 2 = 4
	...
	9 x 9 = 81
 */
