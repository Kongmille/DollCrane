package DollCraneSystem;

public class Controller {
	int position[] = new int[2];
	CraneMap dollMap = new CraneMap();
	public void controlJoystick(String direction) {
		setPosition();
		System.out.println("크레인을 " + direction + "으로 이동합니다.");
	}
	
	public void setPosition() {
		String direction = "";//

		if(direction.equals("left") || direction.equals("right")) {
			if(direction.equals("left")) {
				position[0] -= 1;
			} else {
				position[0] += 1;
			}
		} else if (direction.equals("up") || direction.equals("down")) {
			if(direction.equals("up")) {
				position[1] -= 1;
			} else {
				position[1] += 1;
			}
		}
		
		if(position[0] < 0) {
			position[0] = 0;
		} else if(position[0] > 2) {
			position[0] = 2;
		}
		if(position[1] < 0) {
			position[1] = 0;
		} else if(position[1] > 2) {
			position[1] = 2;
		}
	}
	
	public int[] getPosition() {
		return position;
	}

	public void controlDownbutton() {
		dollMap.getDoll(position[0], position[1]);
		dollMap.setNullDoll(position[0], position[1]);
		System.out.println("<Controller> : 인형을 집었습니다.");
	}
}
