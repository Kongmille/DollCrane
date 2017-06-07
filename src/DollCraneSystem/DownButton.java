package DollCraneSystem;

public class DownButton {
	public boolean downCrane;
	
	public boolean DownButton() { //다운버튼 선택 로직
		if(downCrane == true) {
			System.out.println("크레인을 내립니다");
			return true;
		} else {
			System.out.println("크레인을 내리지 않습니다");
			return false;
		}
	}
}
