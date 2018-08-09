package java05_class.Basic.Ex02;

public class Member {
	/*
	 * 자료형 + 변수명 => 이러한 형식을 필드라고 한다.
	 * private에 대한 설명은 나중에 할 것임으로 생략한다.
	 * setter & getter를 만들기
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
