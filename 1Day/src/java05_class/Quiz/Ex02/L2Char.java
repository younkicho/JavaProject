package java05_class.Quiz.Ex02;

public class L2Char {
	String	tribe;		//����
	String	job;		//����
	String	hair;		//�Ӹ���Ÿ��
	String	nickName;	//ĳ����
	String	jobExplain;	//��������
	
	
	public String getTribe() {
		return tribe;
	}
	public void setTribe(String tribe) {
		this.tribe = tribe;
	}
	public String getJob() {
		return job;
	}
	///////////////////////////////////////////
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
	///////////////////////////////////////////
	public void setJob(String job) {
		this.job = job;
	}
	public String getHair() {
		return hair;
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
}
