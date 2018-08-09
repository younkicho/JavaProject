package java05_class.Basic.Ex05;

public class Member {
	/*
	 * default ������
	 * Ŭ������ ����� �Ǹ� �ڿ������� ����� ���� ���� default �������̴�.
	 * "public Ŭ�����̸�()" �������� �Ǿ������� �����Ǿ� �ִ�.
	 * ������ �����ڸ� �ϳ� ����� �Ǹ� default �����ڴ� �������
	 * ����� �־�� ����� �� �ִ�.
	 * �Ʒ� ������ default �����ڸ� ���ȭ�� �����̴�. 
	 */
	private String picture;
	private String id;
	
	public Member(String id, String picture) {
		this.id = id;
		this.picture = picture;
	}
	///////////////////////////////////////////////////
	//default ������
	public Member() {	}
	///////////////////////////////////////////////////
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
