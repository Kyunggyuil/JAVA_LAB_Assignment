package maze;

public abstract class Moving extends Stack implements CheckAvailableRouteInterface {
	
	public final void move_foward(Coordinate nextPosition, Coordinate currentPosition){
		
		if(this.isAvailable(nextPosition))
		{
			this.push(nextPosition);
			currentPosition = nextPosition;
			MazeArray.visit(nextPosition);
		}
		
	}
	
	public final void move_backward(Coordinate currentPosition){
		currentPosition = this.pop();
	}
	
	public boolean isAvailable(Coordinate position){
		return this.isPath(position)&&this.isFirst(position);
	};
	
	public boolean isPath(Coordinate position){
		return MazeArray.getPath_wall(position);
	}
	
	public boolean isFirst(Coordinate position){
		return MazeArray.getPath_log(position);
	}
	
}
