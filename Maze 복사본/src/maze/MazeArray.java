package maze;

public class MazeArray {
	private static int[][] path_wall = {
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
		{0, 1, 1, 1, 0, 1, 1, 1, 1, 0},
		{0, 0, 0, 1, 1, 1, 0, 1, 0, 0},
		{0, 0, 1, 1, 0, 1, 1, 1, 1, 0},
		{0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 1, 1, 1, 1, 0},
		{0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
	};

	private static int[][] path_log = {
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
	};

	public static boolean getPath_wall(Coordinate position) {
		if(path_wall[position.x][position.y]==1)
			return true;
		else
			return false;
	}
	
	public static int[][] returnPath_wall(){
		return path_wall;
	}

	public static boolean getPath_log(Coordinate position) {
		if(path_log[position.x][position.y]==1)
			return true;
		else
			return false;
	}

	public static void visit(Coordinate position) {
		MazeArray.path_log[position.x][position.y] = 0;
	}
	
}