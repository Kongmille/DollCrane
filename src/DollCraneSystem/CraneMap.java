package DollCraneSystem;

public class CraneMap {
	int map[][] = new int[3][3];
	
	public CraneMap()
	{
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2 - i; j++) {
				if( !(i==0 && j==0) ) {
					map[i][j] = 1;
				}
			}
		}
	}

	public int[][] getMap() {
		return map;
	}

}
