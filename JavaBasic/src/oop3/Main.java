package oop3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAO dao = new OracleDAO();
		dao.insertBoard();
		DAO dao2 = new MySQLDAO();
		dao2.insertBoard();
		
		DAO dao3 = new DAO() {
			
			@Override
			public void insertBoard() {
				System.out.println("MS SQL이 실행되었습니다.");
			}
		};
		dao3.insertBoard();
	}
	

}
