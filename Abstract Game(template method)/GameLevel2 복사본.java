package AbstractGame;

public class GameLevel2 extends GameLevel {

	private static GameLevel2 gameLevel2 = new GameLevel2();
	
	public static GameLevel2 getInstance(){
		return gameLevel2;
	}
	@Override
	public void simpleAttack() {
		System.out.println("Level2 simple attack : 메롱 메~~~");
	}

	@Override
	public void turnAttack() {
		System.out.println("Level2 turn attack : 돌려차기!");
	}

	@Override
	public void flyingAttack() {
		System.out.println("Level2 flying attack : Unavailable");
	}
	
	@Override
	public void gameStart() {
		System.out.println("=====Level2 Start=====");
	}
	@Override
	public void gameEnd() {
		System.out.println("=====Level2 End=====");
	}

}
