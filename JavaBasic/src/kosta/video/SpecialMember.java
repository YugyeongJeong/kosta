package kosta.video;

public class SpecialMember extends GeneralMember {
	
	private int bonus;

	public SpecialMember() {}
	
	public SpecialMember(String id, String name, String address, int num, String title, String actor, int bonus) {
		super(id, name, address, num, title, actor);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "bonus=" + bonus;
	}
	
	

}
