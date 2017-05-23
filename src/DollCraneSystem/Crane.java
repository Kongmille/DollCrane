package DollCraneSystem;

public class Crane {
	private Controller control;
	public Crane(){
		this.control = new Controller();
		
	}
	public Controller controlsignal() {
		return this.control;
	}
}
