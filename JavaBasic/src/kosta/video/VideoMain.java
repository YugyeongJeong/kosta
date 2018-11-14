package kosta.video;

public class VideoMain {

	public static void main(String[] args) {
		
	GeneralMember gm = new GeneralMember();
	gm.setId("aaa");
	gm.setName("공지철");
	gm.setAddress("동탄");
	gm.setVideo(1, "트랜스포머3", "공유");
	System.out.println(gm.toString());
	
	SpecialMember sm = new SpecialMember();
	sm.setId("bbb");
	sm.setName("공유");
	sm.setAddress("동탄");
	sm.setVideo(2, "쿵푸펜더", "공유");
	sm.setBonus(10);
	System.out.println(sm.toString());
	
	//Object arr[] = new Object[2];
	GeneralMember arr[] = new GeneralMember[2];
	arr[0] = gm;
	arr[1] = sm;
	
	System.out.println(arr[0].toString());
	System.out.println(arr[1].toString());
	
	}

}
