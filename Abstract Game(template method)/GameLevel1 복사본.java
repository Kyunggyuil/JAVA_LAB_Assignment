package AbstractGame;

public class GameLevel1 extends GameLevel {

	private static GameLevel1 gameLevel1 = new GameLevel1();
	
	public static GameLevel1 getInstance(){
		return gameLevel1;
	}
	@Override
	public void simpleAttack() {
		System.out.println("Level1 simple attack : 메롱~~~");
	}

	@Override
	public void turnAttack() {
		System.out.println("Level1 turn attack : Unavailable");
	}

	@Override
	public void flyingAttack() {
		System.out.println("Level1 flying attack : Unavailable");
	}
	@Override
	public void gameStart() {
		// TODO Auto-generated method stub
		System.out.println("=====Leve1 Start=====");
	}
	@Override
	public void gameEnd() {
		// TODO Auto-generated method stub
		System.out.println("=====Level1 End=====");
	}

}
