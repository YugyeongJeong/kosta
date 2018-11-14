package kosta.phone;

public class PhoneInfo {
	
	private String name;
	private String phoneNo;
	private String birth;
	
	public PhoneInfo() {}
	
	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	
	@Override
	public String toString() {
		return "name=" + name + ", phoneNo=" + phoneNo + ", birth=" + birth + " ";
	}

	void outputPhoneNo() {
		
		System.out.println(this.name + "님의 전화번호는 " + this.phoneNo + "입니다.");
		
	}

}
