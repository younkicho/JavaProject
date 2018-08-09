package java05_class.Basic.Ex03;

public class Member {
	/*
	 * 생성자
	 * 생성이란 무엇인가 만들어 진다는 개념이다.
	 * 생성자란 new를 이용하여 객체를 만들때 동작되는 메소드이다.
	 * 생장자를 만들경우 반환자료형이 없으며 클래스와 같은 이름으로 만든다.
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
