package maze;

public class DisplayMaze {
	
	private Stack target;
	private Coordinate position = new Coordinate();
	private int[][] model = new int[10][10];
	
	public DisplayMaze(Object input){
		
		model = MazeArray.returnPath_wall();
		
		if(input instanceof Stack)
		{
			target = (Stack)input;
		}
		
		while(!target.isEmpty()){
			position = target.pop();
			model[position.x][position.y] = 2;
		}
		
	}
	
	public void displayMaze(){
		
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				switch(this.model[i][j])
				{
				case 0:
					System.out.print(" W ");
					break;
				case 1:
					System.out.print(" P ");
					break;
				case 2:
					System.out.print(" O ");
					break;
				}
			}
			System.out.println("");
		}
	}
}
