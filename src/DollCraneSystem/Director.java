package DollCraneSystem;

public class Director {

	public static void main(String[] args) {
		Director director = new Director();
		director.playScenario();
	}

	public void playScenario(){
		System.out.println("<ADMIN> : 인형뽑기 시나리오를 시작합니다.");
		
		// 1단계 : 인형뽑기 기계를 생성한다
		System.out.println("<ADMIN> : 인형뽑기 기계를 생성합니다.");
		Crane crane = new Crane();
				
		// 2딘계 : 보행자를 만든다
		System.out.println("<ADMIN> : 사용자를 생성합니다.");
		User user = new User();
		
		// 3단계 : 보행자에게 길 건너기를 시킨다
		System.out.println("<ADMIN> : 사용자에게 인형을 뽑게 합니다");
		user.pickup(crane);
		
	}
	
}
