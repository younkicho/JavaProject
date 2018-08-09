package java05_class.Basic.Ex06.Quiz;

public class ChatBox {
	private String picture;
	private String id;
	private String content;
	private String time;
	
	
	public ChatBox() {
		picture = "";
		id = "";
		content = "";
		time = "";
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
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
