package maze;

public class Coordinate {

	public int x;
	public int y;
	
	public Coordinate(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public Coordinate(){
		this(0, 0);
	}
	
	public boolean equals(Coordinate target){
		if((this.x==target.x)||(this.y==target.y))
		{
			return true;
		}
		return false;
	}
}
