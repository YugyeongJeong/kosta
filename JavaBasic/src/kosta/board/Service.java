package kosta.board;

public class Service {
	
	private DAO dao;

	
	public Service(DAO dao) {
		super();
		this.dao = dao;
	}
	
	public void insertBoard() {
		dao.insertBoard();
	}
}
