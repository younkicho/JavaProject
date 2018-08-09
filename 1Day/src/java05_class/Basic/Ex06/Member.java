package java05_class.Basic.Ex06;

public class Member {
	/*
	 * ������
	 * �ϳ��� �̸����� ���� ���� ��ü�� ����� ���� �������̶�� �Ѵ�.
	 * �������� �̸��� ���� �� Member��� �̸��� ���Եȴ�.
	 * ���̴� ������ �����̴�.
	 * ������ ���� �Ǵ� ������ ������ �ٸ��� �ϸ� ���������� ǥ���� �� �ִ�.
	 * 
	 * ���� �������� �⺻�����ڸ� �״�� ����� ��� null�� ��µǾ�
	 * �̸� �� ������ ä�쵵�� ������ ���̴�.
	 */
	private String picture;
	private String id;
	
	public Member(String id, String picture) {
		this.id = id;
		this.picture = picture;
	}
	///////////////////////////////////////////////////
	//default ������
	public Member() {
		this("","");
	}
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
