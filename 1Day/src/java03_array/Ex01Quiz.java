package java03_array;

public class Ex01Quiz {
	public static void main(String[] args){
		int [] nums;
		nums = new int[10];
		
		for(int i=0;i<10;i++) {
			nums[i] = i*i;
		}
		
		//System.out.println(nums[3]);
		for(int i=1;i<nums.length;i++) {
			System.out.println(i+" x "+ i+" = "+nums[i]);
		}
	}
}
