package kosta.board;

public class Main {
	
	public static void main(String args[]) {
		
		Service sv = new Service(new MySQLDAO());
		sv.insertBoard();
		Service sv2 = new Service(new OracleDAO());
		sv2.insertBoard();
		
	}

}
