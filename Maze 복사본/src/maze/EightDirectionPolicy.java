package maze;

public class EightDirectionPolicy extends Moving {
	public Coordinate currentPosition = new Coordinate(1, 1);
	public Coordinate nextPosition = new Coordinate(1, 1);
	public Coordinate destination = new Coordinate(8, 8);
	private Coordinate[] policy = {
			new Coordinate(1,0),
			new Coordinate(1,1),
			new Coordinate(0, 1),
			new Coordinate(-1, 1),
			new Coordinate(-1, 0),
			new Coordinate(-1, -1),
			new Coordinate(0, -1),
			new Coordinate(1, -1)
			};
	
	public void mazing_eight()
	{
		while(true)
		{
			for(int look = 0; look<4 ; look++)
			{
				nextPosition.x += policy[look].x;
				nextPosition.y += policy[look].y;
				
				if(this.isAvailable(nextPosition)){
					this.move_foward(nextPosition, currentPosition);
					
				}
				
				if(currentPosition.equals(destination)){
					return;
				}
			}
			
			this.move_backward(currentPosition);
		}
	}
}