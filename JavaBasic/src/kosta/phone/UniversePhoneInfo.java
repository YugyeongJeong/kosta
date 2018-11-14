package kosta.phone;

public class UniversePhoneInfo extends PhoneInfo {
	
	private String major;
	private int s_year;
	
	public UniversePhoneInfo() {}

	public UniversePhoneInfo(String name, String phoneNo, String birth, String major, int s_year) {
		super(name, phoneNo, birth);
		this.major = major;
		this.s_year = s_year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getS_year() {
		return s_year;
	}

	public void setS_year(int s_year) {
		this.s_year = s_year;
	}

	@Override
	public String toString() {
		return super.toString() + "major=" + major + ", s_year=" + s_year + " ";
	}
	
	

}
