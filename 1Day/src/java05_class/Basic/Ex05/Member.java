package java05_class.Basic.Ex05;

public class Member {
	/*
	 * default 생성자
	 * 클래스를 만들게 되면 자연스럽게 만들어 지는 것이 default 생성자이다.
	 * "public 클래스이름()" 형식으로 되어있으며 생략되어 있다.
	 * 하지만 생성자를 하나 만들게 되면 default 생성자는 사라지며
	 * 명시해 주어야 사용할 수 있다.
	 * 아래 내용은 default 생성자를 명시화한 내용이다. 
	 */
	private String picture;
	private String id;
	
	public Member(String id, String picture) {
		this.id = id;
		this.picture = picture;
	}
	///////////////////////////////////////////////////
	//default 생성자
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
