package java05_class.Basic.Ex06;

public class Member {
	/*
	 * 다형성
	 * 하나의 이름으로 여러 개의 객체를 만드는 것을 다형성이라고 한다.
	 * 생성자의 이름을 보면 다 Member라는 이름을 갖게된다.
	 * 차이는 인자의 유무이다.
	 * 인자의 개수 또는 인자의 종류를 다르게 하면 다형성으로 표현할 수 있다.
	 * 
	 * 이전 예제에서 기본생성자를 그대로 출력할 경우 null이 출력되어
	 * 이를 빈 값으로 채우도록 변경할 것이다.
	 */
	private String picture;
	private String id;
	
	public Member(String id, String picture) {
		this.id = id;
		this.picture = picture;
	}
	///////////////////////////////////////////////////
	//default 생성자
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
