package DollCraneSystem;

import java.util.Scanner;

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
		control.controlJoystick("right");
		control.controlJoystick("right");
		control.controlJoystick("down");
	}


}
