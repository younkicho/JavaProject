package java05_class.Basic.Ex03;

public class Member {
	/*
	 * ������
	 * �����̶� �����ΰ� ����� ���ٴ� �����̴�.
	 * �����ڶ� new�� �̿��Ͽ� ��ü�� ���鶧 ���۵Ǵ� �޼ҵ��̴�.
	 * �����ڸ� ������ ��ȯ�ڷ����� ������ Ŭ������ ���� �̸����� �����.
	 */
	private String picture;
	private String id;
	
	///////////////////////////////////////////////////
	public Member(String argId, String argPicture) {
		id = argId;
		picture = argPicture;
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
