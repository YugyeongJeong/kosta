package kosta.video;

public class Video {
	
	private int num;
	private String title;
	private String actor;
	
	public Video(int num, String title, String actor) {
		super();
		this.num = num;
		this.title = title;
		this.actor = actor;
	}

	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getActor() {
		return actor;
	}
	
	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "num=" + num + ", title=" + title + ", actor=" + actor;
	}

}
