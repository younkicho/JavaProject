package java05_class.Basic.Ex02;

public class Member {
	/*
	 * �ڷ��� + ������ => �̷��� ������ �ʵ��� �Ѵ�.
	 * private�� ���� ������ ���߿� �� �������� �����Ѵ�.
	 * setter & getter�� �����
	 */
	private String picture;
	private String id;
	
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
