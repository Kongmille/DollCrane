package DollCraneSystem;

public class CraneMap {

	Doll map[][] = new Doll[3][3]; //맵 범위 설정
	
	

	public CraneMap() //맵 생성
	{
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i==0 && j==0) {
					
				} else {
					map[i][j] = new Doll();
					//System.out.println(map[i][j]);
				}
			}
		}
	}

	public Doll[][] getMap() {
		return map;
	}
	
	public Doll getDoll(int X, int Y){
		return map[X][Y];
	}
	
	public void setNullDoll(int X, int Y){
		map[X][Y] = null;
	}
	
	public void setMap(Doll[][] newMap){
		map = newMap;
	}

}
