package DollCraneSystem;

//import java.util.Scanner;

public class User {
	
	public int coin = 0;
	public boolean insertFlag = false;
	//public int tempcoin;

	public void insertcoin(Crane crane) {
		// System.out.println("<SYSTEM> : 동전을 넣으시겠습니까? (1.yes / 2.no) >>");

		// Scanner sc = new Scanner(System.in);
		// tempcoin = sc.nextInt();
		crane.setCraneCoin(1);
	}

	public void pickup(Crane crane) {
		//Controller tempcoin = someplace.controlsignal();
		Controller control = crane.getControl();
		
		//임의로 내부에서 사용자의 조이스틱 동작 지정
		control.controlJoystick("right");
		System.out.println("<User> : 우측으로 한번 조이스틱을 움직입니다.");
		control.controlJoystick("right");
		System.out.println("<User> : 우측으로 한번 조이스틱을 움직입니다.");
		control.controlJoystick("down");
		System.out.println("<User> : 아래로 한번 조이스틱을 움직입니다.");
	}


}
