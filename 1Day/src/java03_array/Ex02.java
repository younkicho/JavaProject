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
		System.out.println(i+"��° �ߺ��� ���ڰ� �����մϴ�.");
	}
}

/*
 * �ζ� ��ȣ ������ ����
 * 1~45������ ������ ���� 6���� ����ϴ� ���α׷��� �����Ͻÿ�(�ߺ� ����)
 */
