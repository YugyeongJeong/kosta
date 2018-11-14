package kosta.video;

public class GeneralMember {
	
	private String id;
	private String name;
	private String address;
	private Video video;
	
	public GeneralMember() {}
	
	public GeneralMember(String id, String name, String address, int num, String title, String actor ) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.video = new Video(num, title, actor);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo( int num, String title, String actor ) {
		this.video = new Video(num, title, actor);
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", address=" + address + " " + video.toString();
	}

	

}
