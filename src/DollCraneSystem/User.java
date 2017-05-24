package DollCraneSystem;

import java.util.Scanner;

public class User {
	
public int tempcoin;
	
	public int insertcoin() {
		System.out.println("<SYSTEM> : 동전을 넣으시겠습니까? (1.yes / 2.no) >>");
		
		Scanner sc = new Scanner(System.in);
		tempcoin = sc.nextInt();
				
		return tempcoin;
	}
	
	public void pickup(Crane someplace) {
		Controller tempcoin = someplace.controlsignal();
		
		tempcoin.changelight(selectcross());
		boolean responce = tempcoin.ongreenlight();
		if(responce == true) {
			System.out.println("<SYSTEM> : 이제 건너가도 좋습니다.");
			SignalTimer signaltimer = new SignalTimer();
			signaltimer.SigT();
		} else {
			System.out.println("<SYSTEM> : 지금은 건널 수 없습니다.");
		}
	System.out.println("<SYSTEM> : 보행자 신호가 종료되었습니다.");
	}


}
