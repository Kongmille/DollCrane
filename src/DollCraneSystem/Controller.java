package DollCraneSystem;

public class Controller {
	JoyStick joyStick = new JoyStick();
	DownButton downButton = new DownButton();
	int position[] = new int[2];

	public void controlJoystick(String direction) {
		joyStick.setDirection(direction);
		setPosition();
	}
	
	public void setPosition() {
		String direction = joyStick.getDirection();

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
		downButton.DownButton();  //다운버튼 누르기
	}
}
