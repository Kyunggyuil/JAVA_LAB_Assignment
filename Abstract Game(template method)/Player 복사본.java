package AbstractGame;

public class Player {
	
	public int currentLevel=0;
	
	public GameLevel[] LevelList = new GameLevel[3];
	{
	LevelList[0]=GameLevel1.getInstance();
	LevelList[1]=GameLevel2.getInstance();
	LevelList[2]=GameLevel3.getInstance();
	}
	
	public void upgradeLevel() {
		currentLevel++;
	}
	
	public int getGameLevel(){
		return currentLevel;
	}
	
	public void attack(){
		LevelList[currentLevel].play();
	}
}
