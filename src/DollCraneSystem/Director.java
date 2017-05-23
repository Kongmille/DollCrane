package DollCraneSystem;

public class Director {

	public static void main(String[] args) {
		Director director = new Director();
		director.playScenario();
	}

	public void playScenario(){
		System.out.println("<ADMIN> : 인형뽑기 시나리오를 시작합니다.");
		
		// 1단계 : 횡단보도를 만든다
		System.out.println("<ADMIN> : 힝단보도를 생성합니다.");
		CrossWalk crosswalk = new CrossWalk();
				
		
		// 2딘계 : 보행자를 만든다
		System.out.println("<ADMIN> : 보행자를 생성합니다.");
		Pedestrian pedestrian = new Pedestrian();
		
		// 3단계 : 보행자에게 길 건너기를 시킨다
		System.out.println("<ADMIN> : 보행자에게 길을 건너게 합니다");
		pedestrian.cross(crosswalk);
		
	}
	
}
