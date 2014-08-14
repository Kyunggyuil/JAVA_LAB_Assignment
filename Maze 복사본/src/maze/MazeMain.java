package maze;

public class MazeMain {

	public static void main(String[] args) {
		
		EightDirectionPolicy testingMaze_eight = new EightDirectionPolicy();
		FourDirectionPolicy testingMaze_four = new FourDirectionPolicy();
		
		testingMaze_eight.mazing_eight();
		testingMaze_four.mazing_four();
		
		DisplayMaze eightDirectionMaze = new DisplayMaze(testingMaze_eight);
		DisplayMaze fourDirectionMaze = new DisplayMaze(testingMaze_four);
		
		eightDirectionMaze.displayMaze();
		System.out.println("=======================");
		fourDirectionMaze.displayMaze();
		System.out.println("=======================");
	}

}
