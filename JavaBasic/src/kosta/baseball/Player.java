package kosta.baseball;

public abstract class Player {
	
	public final static int MAX = 3;
	
	private int nums[] = new int [MAX];

	public int[] getNums() {
		return nums;
	}

	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public abstract void generate();
}
