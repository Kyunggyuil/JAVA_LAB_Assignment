package AbstractGame;

public class GameLevel3 extends GameLevel {

	private static GameLevel3 gameLevel3 = new GameLevel3();
	
	public static GameLevel3 getInstance(){
		return gameLevel3;
	}
	@Override
	public void simpleAttack() {
		System.out.println("Level3 simple attack : 메롱 메롱 메~~~");
	}

	@Override
	public void turnAttack() {
		System.out.println("Level3 turn attack : 태풍 발차기!");
	}

	@Override
	public void flyingAttack() {
		System.out.println("Level3 flying attack : 날라차기!");
	}
	@Override
	public void gameStart() {
		// TODO Auto-generated method stub
		System.out.println("=====Level3 Start=====");
	}
	@Override
	public void gameEnd() {
		// TODO Auto-generated method stub
		System.out.println("=====Level3 Start=====");
	}

}
