package maze;

public interface CheckAvailableRouteInterface {

	public boolean isPath(Coordinate nextPosition);
	public boolean isFirst(Coordinate nextPosition);
	public boolean isAvailable(Coordinate nextPosition);
}
