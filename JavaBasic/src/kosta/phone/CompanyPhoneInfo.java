package kosta.phone;

public class CompanyPhoneInfo extends PhoneInfo {

	private String dept;
	private String position;
	
	public CompanyPhoneInfo() {}
	
	public CompanyPhoneInfo(String name, String phoneNo, String birth, String dept, String position) {
		super(name, phoneNo, birth);
		this.dept = dept;
		this.position = position;
	}



	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return super.toString() + "dept=" + dept + ", position=" + position + " ";
	}
	
}
