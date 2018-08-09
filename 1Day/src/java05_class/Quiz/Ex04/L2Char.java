package java05_class.Quiz.Ex04;

public class L2Char {
	String	tribe;		//종족
	String	job;		//직업
	String	hair;		//머리스타일
	String	nickName;	//캐릭명
	String	jobExplain;	//직업설명
	
	///////////////////////////////////////////
	L2Char(String tribe){
		this.tribe = tribe;
	}
	L2Char(){
		this("워리어");
		this.setJob(1);
		this.setHair(1);
	}
	///////////////////////////////////////////
	public String getTribe() {
		return tribe;
	}
	public void setTribe(String tribe) {
		this.tribe = tribe;
	}
	public String getJob() {
		return job;
	}
	public void setJob(int num){
		switch(num){
		case 1: 
		this.setJob("워리어");
		this.setJobExplain("워리어\n"
				+ "워리어는 가장 기본적인 전사의\n"
				+ "형태를 띤 클래스입니다.\n"
				+ "근접 위주의 기초적인 기술을 사용합니다.\n");
		break;
		case 2: 
			job = "로그";
			jobExplain = "로그\n"
					+ "단검과 활을 다루는데 능숙합니다.\n"
					+ "근거리, 원거리 문제없이\n"
					+ "데미지를 주는 전천후 딜러입니다.\n";
		break;
		case 3: 
			job = "메이지";
			jobExplain = "메이지\n"
					+ "메이지는 다양한 공격 마법을\n"
					+ "사용하여 멀리 있는 적을 상대하는\n"
					+ "스타일의 클래스입니다.\n";
		break;
		}
		System.out.println(job);
		System.out.println(jobExplain);
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getHair() {
		return hair;
	}
	public void setHair(int n) {
		switch(n){
		case 1: hair = "St. A";		break;
		case 2: hair = "St. B";		break;
		case 3: hair = "St. C";		break;
		}
		System.out.println(hair);
	}
	public void setHair(String hair) {
		this.hair = hair;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getJobExplain() {
		return jobExplain;
	}
	public void setJobExplain(String jobExplain) {
		this.jobExplain = jobExplain;
	}
	
	void showMove(int n){		//움직임 살펴보기
		switch(n){
		case 1: System.out.println("환호");
		break;
		case 2: System.out.println("인사");
		break;
		case 3: System.out.println("화남");
		break;
		}
	}
}
