package java05_class.Basic.Ex04;

public class Member {
	/*
	 * this ������
	 * this�� Ŭ���� �ڽ��� �ǹ��Ѵ�.
	 * ���⼭�� Member�� ���ϰ� �ȴ�.
	 */
	private String picture;
	private String id;
	
	///////////////////////////////////////////////////
	//���⼭ this�� Member�� �ǹ��ϸ�
	//this.id�� ���� Ŭ���� ���ο� �ִ� id, �� ������� id���Ǹ�
	//�����ʿ� �ִ� id�� ���ڷ� ���޵� id�� �ǹ��Ѵ�.
	//public Member(String argId, String argPicture) {
	public Member(String id, String picture) {
	//	id = argId;
	//	picture = argPicture;
		this.id = id;
		this.picture = picture;
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
