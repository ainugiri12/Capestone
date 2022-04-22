package looC;

public class GameRunner {
	
//	private Snake game;
//	private MarioGame game;
	private GamingConsole game;
	public GameRunner(GamingConsole game) {
		super();
		this.game = game;
	}
	
	public void runGames() {
		game.start();
		game.left();
		game.up();
		game.down();
		game.right();
		game.left();
	}

}
