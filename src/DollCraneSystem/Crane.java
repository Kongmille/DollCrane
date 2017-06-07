package DollCraneSystem;

public class Crane {
	Controller control = new Controller();
	private int craneCoin = 0;
	
	private CraneMap cMap;
	
	//public Crane(){
	//	this.control = new Controller();	
	//}
	
	//public Controller controlsignal() {
	//	return this.control;
	//}

	public int getCraneCoin() {
		return craneCoin;
	}
	
	public void setCraneCoin(int craneCoin) {
		this.craneCoin = craneCoin;
	}

	public Controller getControl() {
		return control;
	}

	public void setControl(Controller control) {
		this.control = control;
	}
	
	public boolean coinCheck() {
		if(this.craneCoin > 0) {
			System.out.println("인형뽑기를 시작합니다.");
			return true;
		} else {
			System.out.println("코인을 넣어주세요.");
			return false;
		}
	}
}
