package looC;

public class RunTest {
	public static void main(String[] args) {
//		Snake game = new Snake();
//		MarioGame game = new MarioGame();
		GamingConsole game = new MarioGame();
		GameRunner r1 = new GameRunner(game);
		r1.runGames();
	}

}
