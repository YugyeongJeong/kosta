package kosta.dos;

import java.util.Scanner;

public class DosMain {

	public static void main(String[] args) {

		String home = "C://Users//kosta";
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print(home + ">");
			String line = sc.nextLine();
			String cmd[] = line.split(" ");
			
			if (cmd.equals("exit"))
				break;

			switch (cmd[0]) {
			case "ls":

				break;
			case "cd":

				break;
			case "mkdir":

				break;
			case "cp":
				
				break;
			default:
				System.out.println("해당 명령을 찾을 수 없습니다 :(");
				continue;
			}
		}
	}

}
