package AbstractGame;

public abstract class GameLevel {
	public abstract void simpleAttack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
	public abstract void gameStart();
	public abstract void gameEnd();
	
	public final void play(){
		gameStart();
		simpleAttack();
		turnAttack();
		flyingAttack();
		gameEnd();
	}
	
}
