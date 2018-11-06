package kosta.oop;

public class PhoneInfo {
	
	String name;
	String phoneNo;
	String birth;
	
	public PhoneInfo() {}
	
	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}

	void outputPhoneNo() {
		
		System.out.println(this.name + "님의 전화번호는 " + this.phoneNo + "입니다.");
		
	}

}
