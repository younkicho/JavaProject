package java05_class.Basic.Ex04;

public class Member {
	/*
	 * this 연산자
	 * this는 클래스 자신을 의미한다.
	 * 여기서는 Member를 뜻하게 된다.
	 */
	private String picture;
	private String id;
	
	///////////////////////////////////////////////////
	//여기서 this는 Member를 의미하며
	//this.id는 현재 클래스 내부에 있는 id, 즉 멤버변수 id가되며
	//오른쪽에 있는 id는 인자로 전달된 id를 의미한다.
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
