package java05_class.Quiz.Ex05;

public class L2Char {
	String	tribe;		//����
	String	job;		//����
	String	hair;		//�Ӹ���Ÿ��
	String	nickName;	//ĳ����
	String	jobExplain;	//��������
	
	///////////////////////////////////////////
	L2Char(String tribe){
		this.tribe = tribe;
	}
	L2Char(){
		this("������");
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
		this.setJob("������");
		this.setJobExplain("������\n"
				+ "������� ���� �⺻���� ������\n"
				+ "���¸� �� Ŭ�����Դϴ�.\n"
				+ "���� ������ �������� ����� ����մϴ�.\n");
		break;
		case 2: 
			job = "�α�";
			jobExplain = "�α�\n"
					+ "�ܰ˰� Ȱ�� �ٷ�µ� �ɼ��մϴ�.\n"
					+ "�ٰŸ�, ���Ÿ� ��������\n"
					+ "�������� �ִ� ��õ�� �����Դϴ�.\n";
		break;
		case 3: 
			job = "������";
			jobExplain = "������\n"
					+ "�������� �پ��� ���� ������\n"
					+ "����Ͽ� �ָ� �ִ� ���� ����ϴ�\n"
					+ "��Ÿ���� Ŭ�����Դϴ�.\n";
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
	
	void showMove(int n){		//������ ���캸��
		switch(n){
		case 1: System.out.println("ȯȣ");
		break;
		case 2: System.out.println("�λ�");
		break;
		case 3: System.out.println("ȭ��");
		break;
		}
	}
}
